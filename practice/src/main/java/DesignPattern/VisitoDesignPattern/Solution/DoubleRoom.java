package DesignPattern.VisitoDesignPattern.Solution;

public class DoubleRoom implements Room{
    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
