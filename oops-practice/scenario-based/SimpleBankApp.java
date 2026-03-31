interface BankWork {
	void depositMoney(Account acc, double money);
	void withdrawMoney(Account acc, double money);
	void sendMoney(Account fromAcc, Account toAcc, double money);
}

abstract class Account {
	protected int number;
	protected double balance;

	public Account(int number, double balance) {
		this.number = number;
		this.balance = balance;
	}

	public synchronized double checkBalance() {
		return balance;
	}

	public abstract double interest();
}

class SavingAccount extends Account {
	public SavingAccount(int number, double balance) {
		super(number, balance);
	}
	public double interest() {
		return balance * 0.15;
	}
}

class CurrentAccount extends Account {
	public CurrentAccount(int number, double balance) {
		super(number, balance);
	}
	public double interest() {
		return 0;
	}
}

class BalanceNotEnoughException extends RuntimeException {
	public BalanceNotEnoughException(String msg) {
		super(msg);
	}
}

class BankProcess implements BankWork {

	public synchronized void depositMoney(Account acc, double money) {
		synchronized (acc) {
			if (money > 0) {
				acc.balance += money;
			}
		}
	}

	public synchronized void withdrawMoney(Account acc, double money) {
		synchronized (acc) {
			if (acc.balance < money) {
				throw new BalanceNotEnoughException("Insufficient Balance");
			}
			acc.balance -= money;
		}
	}

	public void sendMoney(Account fromAcc, Account toAcc, double money) {
		synchronized (fromAcc) {
			synchronized (toAcc) {
				withdrawMoney(fromAcc, money);
				depositMoney(toAcc, money);
			}
		}
	}
}

public class SimpleBankApp {

	public static void main(String[] args) throws InterruptedException {

		BankWork bank = new BankProcess();

		Account acc1 = new SavingAccount(55522, 5000);
		Account acc2 = new SavingAccount(66633, 7000);

		Thread t1 = new Thread(() -> bank.sendMoney(acc1, acc2, 2500));
		t1.start();
		t1.join();

		Thread t2 = new Thread(() -> bank.sendMoney(acc2, acc1, 500));
		t2.start();
		t2.join();

		System.out.println("Account 1 balance is " + acc1.checkBalance());
		System.out.println("Account 2 balance is " + acc2.checkBalance());
		System.out.println();

		bank.depositMoney(acc1, 5000);
		System.out.println("Account 1 balance is " + acc1.checkBalance());

		bank.withdrawMoney(acc2, 670);
		System.out.println("Account 2 balance is " + acc2.checkBalance());
	}
}
