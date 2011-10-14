/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package us.nstro.javaauction.auction;

import java.util.UUID;

/**
 * AuctionInfo represents the "static" information that all auctions will
 * have, such as the auction identifier, name, auctioneer who is trying to
 * sell the product, and the product in question.
 *
 * @author bbecker
 */
public class AuctionInfo {

    private UUID auctionID;
    private String name;
    private User auctioneer;
    private Item product;

    /**
     * Create a new Auction Information object.
     */
    public AuctionInfo(UUID id, String name, User auctioneer, Item product) {
        this.auctionID = id;
        this.name = name;
        this.auctioneer = auctioneer;
        this.product = product;
    }

    /**
     * Get the auction identifier.
     */
    public UUID getAuctionID() {
        return this.auctionID;
    }

    /**
     * Get the auction name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the auctioneer who posted this auction.
     */
    public User getAuctioneer() {
        return this.auctioneer;
    }

    /**
     * Get the product which is being sold in this auction.
     */
    public Item getProduct() {
        return this.product;
    }

}
