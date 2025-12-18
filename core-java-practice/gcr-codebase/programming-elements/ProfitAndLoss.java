public class ProfitAndLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        System.out.println("The cost price is INR " + costPrice 
            + " and the selling price is INR " + sellingPrice
             +"\nThe profit is INR " + profit 
            + " and the profit percentage is " + String.format("%.2f", profitPercentage));
    }
}