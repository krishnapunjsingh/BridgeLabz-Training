
import java.util.ArrayList;
import java.util.List;

public class OnlineShopSorting {
   public static void main(String[] args) {
      List<Product> products  = new ArrayList<>();
      products.add(new Product(1, "Laptop", 80000, 4.5, 10));
      products.add(new Product(2, "Smartphone", 50000, 4.7, 15));
      products.add(new Product(3, "Tablet", 30000, 4.2, 5));

      products.sort((p1,p2) -> Double.compare(p1.price, p2.price));
      System.out.println("Sort by price: ");
      products.forEach(p -> System.out.println(p));

      products.sort((p1,p2) -> Double.compare(p2.rating, p1.rating));
      System.out.println("\nSort by rating: ");
      products.forEach(p -> System.out.println(p));

      products.sort((p1,p2) -> Double.compare(p2.discount, p1.discount));
      System.out.println("\nSort by discount: ");   
      products.forEach(p -> System.out.println(p));

   } 
}
