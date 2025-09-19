package org.developer.patterns.behavioral.strategy;

public class OffRoadCar extends Car {

    public OffRoadCar() {
        super(new SportsDriveStrategy());
    }
}
