package DesignPattern.VisitoDesignPattern.Solution;

public class RoomPriceVisitor implements Visitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("calculate price");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {

    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {

    }
}
