package com.kubek.kubeksuperduperbot.core.entities;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Price {

    private final BigDecimal value;
    private final OffsetDateTime timestamp;

    public Price(BigDecimal value, OffsetDateTime timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}
