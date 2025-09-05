package StrategyPattern;
import DataModels.*;
/**
 * Interface สำหรับกลยุตธ์ส่วนลด
 */
public interface discountStrategy {
    double applyDiscount(Order order);
}
