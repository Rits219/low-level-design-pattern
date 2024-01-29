package DesignPattern.MediatorDesignPattern;

public class Bidder implements Colleague {
    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        System.out.println(name + "has placed the bid with bidAmount " + bidAmount);
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveNotifications(int bidAmount) {
        System.out.println("bidder: " + name + " got the notification that bid with bidAmount: " + bidAmount + " has been placed");
    }

    @Override
    public String getName() {
        return name;
    }
}
