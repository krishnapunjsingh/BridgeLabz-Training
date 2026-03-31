// package ecommerceordermanagementsystem;

public class Product{
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }

}