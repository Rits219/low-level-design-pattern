package OrderManagementSystem;

import java.util.Map;

public class Order {
    private User user;

    private Warehouse warehouse;
    private Map<Integer, Integer> productIdVsCount;
    private Invoice invoice;
    private Payment payment;
    private OrderStatus orderStatus;
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    //create order
    public Order(User user, Warehouse warehouse, Invoice invoice, int orderId) {
        this.user = user;
        this.warehouse = warehouse;
        this.productIdVsCount = user.getProductIdvsCount();
        this.invoice = invoice;
        this.payment = new Payment();
        this.orderId = orderId;
        this.orderStatus = OrderStatus.CREATED;
    }

    public void updateOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
