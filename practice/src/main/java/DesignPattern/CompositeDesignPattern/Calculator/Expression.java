package DesignPattern.CompositeDesignPattern.Calculator;

public class Expression implements ArithmeticExpression {
    private ArithmeticExpression leftArithmeticExpression;
    private ArithmeticExpression rightArithmeticExpression;
    private Operation operation;

    public Expression(ArithmeticExpression leftArithmeticExpression, ArithmeticExpression rightArithmeticExpression, Operation operation) {
        this.leftArithmeticExpression = leftArithmeticExpression;
        this.rightArithmeticExpression = rightArithmeticExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() throws Exception {
        switch (operation) {
            case ADD:
                return leftArithmeticExpression.evaluate() + rightArithmeticExpression.evaluate();
            case SUBTRACT:
                return leftArithmeticExpression.evaluate() - rightArithmeticExpression.evaluate();
            case MULTIPLY:
                return leftArithmeticExpression.evaluate() * rightArithmeticExpression.evaluate();
            case DELETE:
                return leftArithmeticExpression.evaluate() / rightArithmeticExpression.evaluate();
        }
        throw new Exception("operation not successull");
    }
}
