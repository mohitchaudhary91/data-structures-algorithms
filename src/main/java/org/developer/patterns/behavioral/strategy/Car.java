package org.developer.patterns.behavioral.strategy;

public class Car {

    private final DriveStrategy driveStrategyObj;

    public Car(DriveStrategy driveStrategyObj) {
        this.driveStrategyObj = driveStrategyObj;
    }

    void drive() {
        this.driveStrategyObj.drive();
    }
}
