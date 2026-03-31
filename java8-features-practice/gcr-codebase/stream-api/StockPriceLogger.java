import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
                245.50,
                250.75,
                248.30,
                252.10,
                249.90
        );

        // Print all stock prices
        stockPrices.forEach(price ->
                System.out.println("Stock Price: ₹" + price)
        );
    }
}
