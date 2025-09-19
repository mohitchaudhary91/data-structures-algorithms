package org.developer.patterns.behavioral.strategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sports drive capability");
    }
}
