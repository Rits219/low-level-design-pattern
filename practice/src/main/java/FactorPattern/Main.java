package FactorPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("CIRCLE");
        shapeObj.draw();
    }
}
