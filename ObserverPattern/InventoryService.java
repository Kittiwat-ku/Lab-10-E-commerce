package ObserverPattern;

import DataModels.Order;

public class InventoryService implements OrderObserver{

    @Override
    public void update(Order order) {
        System.out.println("[Email Service] confirmation email sent to"+ order.customerEmail() + 
        "for order:" + order.orderId());
    }
    
}
