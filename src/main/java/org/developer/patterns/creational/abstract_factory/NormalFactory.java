package org.developer.patterns.creational.abstract_factory;

public class NormalFactory implements VehicleFactory {

    public Vehicle getVehicle(String car) {
        switch (car) {
            case "SWIFT" -> {
                return new Swift();
            }
            case "HYUNDAI" -> {
                return new Hyundai();
            }
            default -> {
                return null;
            }
        }
    }
}
