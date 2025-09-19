package org.developer.patterns.solid.dependency_inversion;

public class BluetoothMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("Moving wireless");
    }
}
