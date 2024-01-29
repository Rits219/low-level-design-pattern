package DesignPattern.MediatorDesignPattern;

public class Main {
    public static void main(String[] args) {
        AuctionMediator mediator = new IPLAuction();

        Colleague mumbai = new Bidder("mumbai", mediator);
        Colleague rajasthan = new Bidder("Rajashtan", mediator);

        mumbai.placeBid(20);
        rajasthan.placeBid(30);
        mumbai.placeBid(40);
    }
}
