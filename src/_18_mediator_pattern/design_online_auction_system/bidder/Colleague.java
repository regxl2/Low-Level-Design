package _18_mediator_pattern.design_online_auction_system.bidder;

public interface Colleague {
    void placeBid(int amount);
    void receiveBidNotification(String bidderName, int amount);
    String getName();
}
