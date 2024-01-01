package DesignPattern.CompositeDesignPattern.Calculator;

public class Main {
    public static void main(String[] args) throws Exception {
        //evaluate 2*(1+7)
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression expression = new Expression(one, seven, Operation.ADD);

        ArithmeticExpression parentExpression = new Expression(two, expression, Operation.MULTIPLY);
        System.out.println(parentExpression.evaluate());

    }
}
