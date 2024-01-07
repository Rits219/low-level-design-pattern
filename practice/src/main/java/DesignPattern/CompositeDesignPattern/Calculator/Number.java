package DesignPattern.CompositeDesignPattern.Calculator;

public class Number implements ArithmeticExpression {
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        return number;
    }
}