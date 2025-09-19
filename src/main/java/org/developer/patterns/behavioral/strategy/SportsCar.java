package org.developer.patterns.behavioral.strategy;

public class SportsCar extends Car {

    public SportsCar() {
        super(new SportsDriveStrategy());
    }
}
