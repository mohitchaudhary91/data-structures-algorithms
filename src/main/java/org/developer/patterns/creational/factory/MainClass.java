package org.developer.patterns.creational.factory;

public class MainClass {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("RECTANGLE");
        shape.draw();
    }
}
