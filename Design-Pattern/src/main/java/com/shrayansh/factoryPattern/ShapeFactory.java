package com.shrayansh.factoryPattern;

public class ShapeFactory {

    public Shape getShape(ShapeType input) {
        return switch (input) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            default -> new Rectangle();
        };
    }
}
