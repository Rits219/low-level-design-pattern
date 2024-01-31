package DesignPattern.VisitoDesignPattern.Solution;

public interface Visitor {
    public void visit(SingleRoom singleRoom);

    public void visit(DoubleRoom doubleRoom);

    public void visit(DeluxeRoom deluxeRoom);
}
