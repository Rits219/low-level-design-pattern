package com.shrayansh.factoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();


    }
}
