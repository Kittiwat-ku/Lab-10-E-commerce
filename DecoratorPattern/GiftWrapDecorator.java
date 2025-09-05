package DecoratorPattern;

import FactoryMethodPattern.Shipment;
/**
 * Concrete Decorator: บริการห่อของขวัญ
 */
public class GiftWrapDecorator extends ShipmentDecorator{
    public GiftWrapDecorator(Shipment wraShipment){
        super(wraShipment);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.0;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +" Gift Wrapped";
    }
}
