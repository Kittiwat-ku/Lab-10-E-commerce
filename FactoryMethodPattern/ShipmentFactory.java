package FactoryMethodPattern;

public class ShipmentFactory {
    public Shipment crateShipment(String type){
        if ("STANDARD".equalsIgnoreCase(type)) {
            return new StandardShipment();
        }else if ("EXPRESS".equalsIgnoreCase(type)) {
            return new ExpressShipment();
        }
        throw new IllegalArgumentException("unknown shipment");
    }
}
