package org.developer.patterns.creational.factory;

public class ShapeFactory {

    public Shape getShape(String type) {
        Shape shape;
        switch (type) {
            case "CIRCLE" -> {
                shape = new Circle();
                return shape;
            }
            case "RECTANGLE" -> {
                shape = new Rectangle();
                return shape;
            }
            case "SQUARE" -> {
                shape = new Square();
                return shape;
            }
            default -> {
                return null;
            }
        }
    }
}
