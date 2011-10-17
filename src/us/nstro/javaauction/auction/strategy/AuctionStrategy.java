package us.nstro.javaauction.auction.strategy;

import us.nstro.javaauction.bids.Bid;
import us.nstro.javaauction.bids.Price;
import us.nstro.javaauction.types.selection.Selection;

/**
 * The AuctionStrategy determines the valid prices for a bid, and how to
 * calculate the winning bid.
 */
public interface AuctionStrategy {

    /**
     * Gets the valid prices for a bid in this auction.
     *
     * @require: Auction is open
     */
    public Selection<Price> getValidPrices();

    /**
     * Calculates the winning bid for this auction.
     *
     * @require: A bid has been placed
     * @ensure: getWinningBid() != null
     */
    public Bid getWinningBid();

    /**
     * Places the bid 'bid' on this auction. After bidding, the ascending
     * auction is defined to accept the bid so long as it is higher than any
     * other bid.
     *
     * @require: getValidPrices().contains(bid.getPrice())
     * @ensure: Bid has been placed
     */
    public void placeBid(Bid bid);

}