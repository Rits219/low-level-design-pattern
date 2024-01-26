package OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class OrderController {
    List<Order> orderList;

    public OrderController() {
        this.orderList = new ArrayList<>();
    }

    //add order in system
    public Order createOrder(User user, Warehouse warehouse, Invoice invoice, int orderId) {
        Order order = new Order(user, warehouse, invoice, 1);
        orderList.add(order);
        return order;
    }

    //get order details from system
    public Order getOrderFromOrderId(int orderId) {
        for (Order order : orderList
        ) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }
}
