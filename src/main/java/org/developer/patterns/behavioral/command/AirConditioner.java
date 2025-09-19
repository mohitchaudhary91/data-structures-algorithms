package org.developer.patterns.behavioral.command;

public class AirConditioner {

    boolean isAC;

    public AirConditioner() {
        this.isAC = false;
    }

    public void turnOnAC() {
        this.isAC = true;
        System.out.println("AC is turned on!");
    }

    public void turnOffAC() {
        this.isAC = false;
        System.out.println("AC is turned off!");
    }
}
