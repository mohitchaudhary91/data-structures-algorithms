package org.developer.patterns.creational.abstract_factory;

public class AbstractFactory {

    public VehicleFactory getFactory(String type) {
        switch (type) {
            case "LUXURY" -> {
                return new LuxuryFactory();
            }
            case "NORMAL" -> {
                return new NormalFactory();
            }
            default -> {
                return null;
            }
        }
    }
}
