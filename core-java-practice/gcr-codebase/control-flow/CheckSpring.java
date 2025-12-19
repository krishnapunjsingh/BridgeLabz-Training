import java.util.Scanner;
public class CheckSpring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        if((month ==3 && day >=20) || (month == 4) || (month == 5) || (month == 6 && day <=20)) {
            System.out.println("It is Spring season");
        } else {
            System.out.println("It is not Spring season");
        }

    }
}
