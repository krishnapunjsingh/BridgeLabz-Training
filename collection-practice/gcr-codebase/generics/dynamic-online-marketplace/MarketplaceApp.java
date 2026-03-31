public class MarketPlaceApp {

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Book", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 15000, new GadgetCategory());

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Before Discount:");
        catalog.displayCatalog();

        DiscountService.applyDiscount(book, 10);
        DiscountService.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        catalog.displayCatalog();
    }
}
