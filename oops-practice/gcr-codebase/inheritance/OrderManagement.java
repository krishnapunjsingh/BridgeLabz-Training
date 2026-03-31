class Order{
    String orderId;
    String orderName;
    Order(String orderId, String orderName){
        this.orderId = orderId;
        this.orderName = orderName;
    }
    void getOrderStatus(){
        System.out.println("Order name: "+ orderName);
        System.out.println("order Id: "+ orderId );
    }
}
class ShippedOrder extends Order{
    int trackingNumber;

    public ShippedOrder(String orderId, String orderName,int trackingNumber) {
        super(orderId,orderName);
        this.trackingNumber = trackingNumber;
    }
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking Number "+ trackingNumber);
    }
    

}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderName,int trackingNumber,String deliveryDate) {
        super(orderId, orderName,trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
    }
    
}
class OrderManagement{
    public static void main(String[] args) {
        DeliveredOrder d1 = new DeliveredOrder("ORD101","Laptop",987654,"05-Jan-2026");
        d1.getOrderStatus();
    }
}