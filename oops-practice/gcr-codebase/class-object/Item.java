class Item {

    String itemCode;
    String itemName;
    double itemPrice;

    void displayItemDetails() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + itemPrice);
        System.out.println("itemName : " + itemName);
        System.out.println("----------------------------");
    }

    double calculateTotalCost(int quantity) {
        return itemPrice * quantity;
    }

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemCode = "01AA";
        item1.itemPrice = 500.0;
        item1.itemName = "Water bottle";

        Item item2 = new Item();
        item2.itemCode = "01BB";
        item2.itemPrice = 700.0;
        item2.itemName = "Rice";

        Item item3 = new Item();
        item3.itemCode = "02AA";
        item3.itemPrice = 400.0;
        item3.itemName = "blackboard";

        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();

        int quantity = 2;
        System.out.println("Total cost for " + quantity + " items: " +item1.calculateTotalCost(quantity));
    }
}
