public class WarehouseMain {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 170000));
        electronicsStorage.addItem(new Electronics("Tablet", 100000));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 170));
        groceriesStorage.addItem(new Groceries("Oil", 250));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 1700));
        furnitureStorage.addItem(new Furniture("Table", 2500));

        System.out.println("Electronics:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}
