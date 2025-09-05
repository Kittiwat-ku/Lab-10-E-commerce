package DecoratorPattern;

import DataModels.Order;
import FactoryMethodPattern.Shipment;
/**
 * Concrete Decorator: บริการประกันสินค้า
 */
public class InsuranceDecorator extends ShipmentDecorator{
private final Order order;
    public InsuranceDecorator(Shipment wrappedShipment,Order order) {
        super(wrappedShipment);
        this.order = order;
    }
    @Override
    public double getCost() {
        // ค่าประกัน 10% ของราคาสินค้า
        return super.getCost()+(order.getTotalPrice()*0.10);
    }

    @Override   
    public String getInfo() {
        return super.getInfo()+" Insurance";
    }


    
}
