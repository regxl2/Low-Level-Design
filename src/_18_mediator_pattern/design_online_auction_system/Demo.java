package _18_mediator_pattern.design_online_auction_system;


//Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.
//The pattern restricts direct communications between the objects and forces them to collaborate only
//via a mediator object.

import _18_mediator_pattern.design_online_auction_system.auction_mediator.Auction;
import _18_mediator_pattern.design_online_auction_system.auction_mediator.AuctionMediator;
import _18_mediator_pattern.design_online_auction_system.bidder.Bidder;

public class Demo {
    public static void main(String[] args) {
        AuctionMediator auction = new Auction();
        Bidder bidder1 = new Bidder("regxl", auction);
        Bidder bidder2 = new Bidder("ballu", auction);
        Bidder bidder3 = new Bidder("lallu", auction);
        Bidder bidder4 = new Bidder("tapori", auction);
        auction.addBidder(bidder1);
        auction.addBidder(bidder2);
        auction.addBidder(bidder3);
        auction.addBidder(bidder4);

        bidder1.placeBid(123);
        System.out.println();
        bidder2.placeBid(124);
        System.out.println();
        bidder3.placeBid(125);
        System.out.println();
        bidder4.placeBid(126);
    }
}
