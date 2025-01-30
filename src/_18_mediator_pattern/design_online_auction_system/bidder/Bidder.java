package _18_mediator_pattern.design_online_auction_system.bidder;

import _18_mediator_pattern.design_online_auction_system.auction_mediator.AuctionMediator;

public class Bidder implements Colleague{
    private final AuctionMediator mediator;
    private final String name;

    public Bidder(String name, AuctionMediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void placeBid(int amount) {
        mediator.placeBid(this, amount);
    }

    @Override
    public void receiveBidNotification(String bidderName, int amount) {
        System.out.println("Bidder name: " + bidderName + " has put a bid of amount: " + amount + ", Notification received by " + name);
    }

    @Override
    public String getName() {
        return name;
    }
}
