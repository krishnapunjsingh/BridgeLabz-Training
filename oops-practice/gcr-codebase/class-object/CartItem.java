class CartItem {

    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        } else {
            System.out.println("Cannot remove more items than present in the cart.");
        }
    }

    void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.printf("Total cost: $%.2f%n", totalCost);
    }

    void displayItem() {
        System.out.printf("Item: %s, Price: $%.2f, Quantity: %d%n", itemName, price, quantity);
    }

    public static void main(String[] args) {

        CartItem item = new CartItem();
        item.itemName = "Laptop";
        item.price = 999.99;
        item.quantity = 1;

        item.displayItem();
        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
