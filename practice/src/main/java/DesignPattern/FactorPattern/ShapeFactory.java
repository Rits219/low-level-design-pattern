package DesignPattern.FactorPattern;

public class ShapeFactory {
    public Shape getShape(String input) {
        return switch (input) {
            case "RECTANGLE" -> new Rectangle();
            default -> new Circle();
        };
    }
}
