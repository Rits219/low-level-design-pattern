package DesignPattern.MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IPLAuction implements AuctionMediator {
    List<Colleague> colleagues = new ArrayList<>();


    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for (Colleague colleague : colleagues
        ) {
            if (!Objects.equals(colleague.getName(), bidder.getName())) {
                colleague.receiveNotifications(bidAmount);
            }
        }
    }
}
