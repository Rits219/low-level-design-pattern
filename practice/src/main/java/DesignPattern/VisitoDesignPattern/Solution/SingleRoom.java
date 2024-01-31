package DesignPattern.VisitoDesignPattern.Solution;

public class SingleRoom implements Room{
    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);   //first dispatch
    }
}
