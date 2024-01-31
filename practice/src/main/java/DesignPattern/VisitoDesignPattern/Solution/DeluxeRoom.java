package DesignPattern.VisitoDesignPattern.Solution;

public class DeluxeRoom implements Room{
    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
