// Main class to test the Shopping system
public class ShoppingSystem {
    public static void main(String[] args) {
        // Creating different order objects with appropriate names
        Order firstOrder = new Order("ORD001", "2025-03-01");
        ShippedOrder secondOrder = new ShippedOrder("ORD002", "2025-01-02", "TRACK002");
        DeliveredOrder finalOrder = new DeliveredOrder("ORD003", "2024-10-03", "TRACK003", "2025-03-05");

        // Displaying the order status for each order type
        System.out.println(firstOrder.getOrderStatus());
        System.out.println(secondOrder.getOrderStatus());
        System.out.println(finalOrder.getOrderStatus());
    }
}

// Base class representing a generic order
class Order {
    String orderId;
    String orderDate;

    // Constructor to initialize order details
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return order status
    public String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass representing a shipped order
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor to initialize shipped order details
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overridden method to return shipped order status
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

// Subclass representing a delivered order
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor to initialize delivered order details
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overridden method to return delivered order status
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}
//output
// Order Placed
//Order Shipped
//Order Delivered