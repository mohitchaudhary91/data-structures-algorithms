package org.developer.patterns.solid.liskov_substitution;

public class Bicycle implements Bike {
    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("Bicycle has no engine!");
    }

    @Override
    public void accelerate() {
        speed = speed + 1;
    }
}
