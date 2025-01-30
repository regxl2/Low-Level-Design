package _18_mediator_pattern.design_online_auction_system.auction_mediator;

import _18_mediator_pattern.design_online_auction_system.bidder.Colleague;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    private final List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void addBidder(Colleague colleague) {
        colleagueList.add(colleague);
    }

    @Override
    public void placeBid(Colleague colleague, int amount) {
        for(Colleague b: colleagueList){
            if(b.equals(colleague)) continue;
            b.receiveBidNotification(colleague.getName(), amount);
        }
    }
}
