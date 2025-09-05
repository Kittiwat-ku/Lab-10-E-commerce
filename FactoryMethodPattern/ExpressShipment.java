package FactoryMethodPattern;
/**
 * Concrete Product: สำหรับจัดส่งแบบด่วน
 */
public class ExpressShipment implements Shipment{

    @Override
    public String getInfo() {
        return "Express Delivery";
    }

    @Override
    public double getCost() {
        return 150.0;
    }
    
}
