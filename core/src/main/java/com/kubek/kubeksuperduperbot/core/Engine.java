package com.kubek.kubeksuperduperbot.core;

import com.kubek.kubeksuperduperbot.core.contracts.Dao;
import com.kubek.kubeksuperduperbot.core.entities.Auction;
import io.vavr.collection.List;

import java.net.URL;

public class Engine {

    private Dao dao;

    public Engine(Dao dao) {
        this.dao = dao;

    }

    public void start() {
        List<Auction> auctions = getAuctions();
    }

    private List<Auction> getAuctions() {
        return List.empty();
    }

    private List<URL> getAuctionUrls() {
        return List.empty();
    }
}
