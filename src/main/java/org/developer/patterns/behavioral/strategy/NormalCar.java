package org.developer.patterns.behavioral.strategy;

public class NormalCar extends Car {

    public NormalCar() {
        super(new NormalDriveStrategy());
    }
}
