package DecoratorPattern;

import FactoryMethodPattern.Shipment;
/**
 * Abstract Decorator สำหรับห่อหุ่ม Shipment
 */
abstract class ShipmentDecorator implements Shipment{
    protected Shipment wrappedShipment;

    public ShipmentDecorator(Shipment wrappedShipment){
        this.wrappedShipment = wrappedShipment;
    }

    @Override
    public double getCost() {
        return wrappedShipment.getCost();
    }

    @Override
    public String getInfo() {
        return wrappedShipment.getInfo();
    }
}
