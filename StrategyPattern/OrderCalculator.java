package StrategyPattern;

import DataModels.Order;

public class OrderCalculator {
    public double calculateFinalPrice(Order order, discountStrategy strategy){
        return strategy.applyDiscount(order);
    }
}
