package org.developer.patterns.creational.abstract_factory;

public class MainClass {

    public static void main(String[] args) {
        AbstractFactory factories = new AbstractFactory();
        VehicleFactory factory = factories.getFactory("LUXURY");
        Vehicle vehicle = factory.getVehicle("BMW");
        vehicle.drive();


        VehicleFactory factory1 = factories.getFactory("NORMAL");
        Vehicle vehicle1 = factory1.getVehicle("HYUNDAI");
        vehicle1.drive();
    }
}
