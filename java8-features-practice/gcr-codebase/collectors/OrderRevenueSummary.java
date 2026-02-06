import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customerName;
    double amount;

    Order(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }
}

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Ravi", 1200.50),
                new Order("Anita", 800.00),
                new Order("Ravi", 450.75),
                new Order("Anita", 300.25),
                new Order("Kumar", 950.00)
        );

        // Sum order totals per customer
        Map<String, Double> revenueByCustomer =
                orders.stream()
                      .collect(Collectors.groupingBy(
                              o -> o.customerName,
                              Collectors.summingDouble(o -> o.amount)
                      ));

        // Print result
        revenueByCustomer.forEach((customer, total) ->
                System.out.println(customer + " : ₹" + total)
        );
    }
}
