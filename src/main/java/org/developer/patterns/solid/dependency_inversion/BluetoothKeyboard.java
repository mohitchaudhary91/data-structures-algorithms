package org.developer.patterns.solid.dependency_inversion;

public class BluetoothKeyboard implements Keyboard {

    @Override
    public void type() {
        System.out.println("Typing wireless");
    }
}
