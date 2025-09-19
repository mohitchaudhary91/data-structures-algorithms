package org.developer.patterns.behavioral.command;

public class Television {

    boolean isTV;

    public Television() {
        this.isTV = false;
    }

    public void turnOnTV() {
        this.isTV = true;
        System.out.println("TV is turned on!");
    }

    public void turnOffTV() {
        this.isTV = false;
        System.out.println("TV is turned off!");
    }
}
