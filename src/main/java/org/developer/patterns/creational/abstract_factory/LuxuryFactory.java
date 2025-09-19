package org.developer.patterns.creational.abstract_factory;

public class LuxuryFactory implements VehicleFactory {

    public Vehicle getVehicle(String car) {
        switch (car) {
            case "BMW" -> {
                return new BMW();
            }
            case "MERC" -> {
                return new Mercedes();
            }
            default -> {
                return null;
            }
        }
    }
}
