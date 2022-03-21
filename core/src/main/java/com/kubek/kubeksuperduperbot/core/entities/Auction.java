package com.kubek.kubeksuperduperbot.core.entities;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import io.vavr.collection.List;

public class Auction {

    protected final String id;
    protected final String catalogNumber;
    protected final String name;
    protected final String url;
    protected final String shop;
    protected final BigDecimal price;


    public Auction(String id, String catalogNumber, String name, String url, String shop, BigDecimal price) {
        this.id = id;
        this.catalogNumber = catalogNumber;
        this.name = name;
        this.url = url;
        this.shop = shop;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getShop() {
        return shop;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
