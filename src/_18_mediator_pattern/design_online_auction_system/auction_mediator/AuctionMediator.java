package _18_mediator_pattern.design_online_auction_system.auction_mediator;

import _18_mediator_pattern.design_online_auction_system.bidder.Colleague;

public interface AuctionMediator {
    void addBidder(Colleague colleague);
    void placeBid(Colleague colleague, int amount);
}
