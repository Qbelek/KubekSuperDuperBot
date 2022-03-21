package com.kubek.kubeksuperduperbot.core.entities.ps5;

import com.kubek.kubeksuperduperbot.core.entities.Auction;
import io.vavr.collection.List;

import java.math.BigDecimal;

public class PS5Auction extends Auction {

    private final BigDecimal estimatedConsolePrice;
    private final List<PS5Addition> additions;

    public PS5Auction(String id, String catalogNumber, String name, String url, String shop,
                      BigDecimal totalPrice, List<PS5Addition> additions) {

        super(id, catalogNumber, name, url, shop, totalPrice);
        this.additions = additions;
        this.estimatedConsolePrice = CalculateEstimatedPrice(additions);
    }

    private BigDecimal CalculateEstimatedPrice(List<PS5Addition> additions) {
        return price.subtract(additions
                .map(PS5Addition::getEstimatedPrice)
                .reduce(BigDecimal::add));
    }

    public BigDecimal getEstimatedConsolePrice() {
        return estimatedConsolePrice;
    }

    public List<PS5Addition> getAdditions() {
        return additions;
    }
}
