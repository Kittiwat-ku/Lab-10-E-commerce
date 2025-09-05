package ObserverPattern;
import java.util.List;

import DataModels.Order;

import java.util.ArrayList;

public class OrderProcessor {
    private final List<OrderObserver> observers = new  ArrayList<>();

    public void register(OrderObserver observer){
        observers.add(observer);
    }
    public void unRegister(OrderObserver observer){
        observers.remove(observer);
    }
    private void notifyObserver(Order order){
        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }
    public void processOrder(Order order){
        System.out.println("\nProcessing order"+ order.orderId()+"...");
        // ... ตรรกะการประมวลผลคำสั่งซื้ออื่นๆ ...
        System.out.println("Order processed successfully. ");
        
        // แจ้งเตือนผู้ติดตามทั้งหมด
        notifyObserver(order);
    }
}
