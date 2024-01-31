package DesignPattern.VisitoDesignPattern.Solution;

public class Main {
    public static void main(String[] args){
        SingleRoom room = new SingleRoom();
        Visitor priceVisitor=new RoomPriceVisitor();
        room.visit(priceVisitor);

    }


}
