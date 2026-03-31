import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class ShoppingCart {

    Map<String, Double> priceMap = new HashMap<>();
    LinkedHashMap<String, Double> cartOrder = new LinkedHashMap<>();

    void addProduct(Product product) {
        priceMap.put(product.name, product.price);
        cartOrder.put(product.name, product.price);
    }

    void displayCartInsertionOrder() {
        System.out.println("Cart (Insertion Order): " + cartOrder);
    }

    void displayCartSortedByPrice() {
        TreeMap<Double, List<String>> sorted = new TreeMap<>();
        for (Map.Entry<String, Double> entry : cartOrder.entrySet()) {
            sorted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        System.out.println("Cart (Sorted by Price): " + sorted);
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Apple", 1.5));
        cart.addProduct(new Product("Banana", 0.8));
        cart.addProduct(new Product("Orange", 1.2));

        cart.displayCartInsertionOrder();
        cart.displayCartSortedByPrice();
    }
}
