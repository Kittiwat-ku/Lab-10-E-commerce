package StrategyPattern;
import DataModels.Order;

/**
 * กลยุตธ์สำหรับคำณวณเงินคงที่
 */
public class fixedDIscount implements discountStrategy{
    private final double amount;

    public fixedDIscount(double amount){
        this.amount = amount;
    }

    @Override
    public double applyDiscount(Order order) {
        return Math.max(0, order.getTotalPrice() - amount);
    }

}
