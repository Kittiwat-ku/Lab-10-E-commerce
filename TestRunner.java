import java.util.List;

import DataModels.*;
import DecoratorPattern.*;
import FactoryMethodPattern.*;
import ObserverPattern.*;
import StrategyPattern.*;
/**
 *
 */
public class TestRunner {
    public static void main(String[] args) {
        System.out.println(" --- E-commerce System Simulation ---");

        // --- 1. Setup ---
        Product RTX5090 = new Product("P001","RTX5090",69999.0);
        Product mouse = new Product("P002","V3pro",5000.0);
        Order myOrder = new Order("ORD-001", List.of(RTX5090,mouse),"kp@gmail.com");

        OrderCalculator calculator = new OrderCalculator();
        ShipmentFactory ShipmentFactory = new ShipmentFactory();

        OrderProcessor orderProcessor = new OrderProcessor();
        InventoryService Inventory = new InventoryService();
        EmailService emailer = new EmailService();
        orderProcessor.register(Inventory);
        orderProcessor.register(emailer);

        System.out.println("--- 2. Testing Strategy Pattern (Discount) ---");
        double originalPrice = myOrder.getTotalPrice();
        System.out.println("Original Price "+ originalPrice);

        discountStrategy tenPercentOff = new PercentageDiscount(10);
        double priceAferPercentage = calculator.calculateFinalPrice(myOrder, tenPercentOff);
        System.out.println("Price with 10% discount:"+ priceAferPercentage);

        discountStrategy fiveHundredOff = new fixedDIscount(500);
        double priceAferFixed = calculator.calculateFinalPrice(myOrder, fiveHundredOff);
        System.out.println("Price with 500 discount:"+ priceAferFixed);
        
    }
}
