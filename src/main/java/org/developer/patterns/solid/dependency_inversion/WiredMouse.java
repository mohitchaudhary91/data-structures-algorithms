package org.developer.patterns.solid.dependency_inversion;

public class WiredMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("Moving");
    }
}
