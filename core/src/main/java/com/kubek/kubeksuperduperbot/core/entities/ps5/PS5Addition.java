package com.kubek.kubeksuperduperbot.core.entities.ps5;

import java.math.BigDecimal;

public class PS5Addition {

    private final String id;
    private final PS5AdditionType type;
    private final String name;
    private final String url;
    private final BigDecimal estimatedPrice;

    public PS5Addition(String id, PS5AdditionType type, String name, String url, BigDecimal estimatedPrice) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.url = url;
        this.estimatedPrice = estimatedPrice;
    }

    public PS5Addition(String id, PS5AdditionType type, String name, String url) {
        this(id, type, name, url, type.getDefaultPrice());
    }

    public String getId() {
        return id;
    }

    public PS5AdditionType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public BigDecimal getEstimatedPrice() {
        return estimatedPrice;
    }
}

