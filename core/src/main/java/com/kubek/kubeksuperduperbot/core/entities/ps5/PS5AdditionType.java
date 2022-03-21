package com.kubek.kubeksuperduperbot.core.entities.ps5;

import java.math.BigDecimal;

public enum PS5AdditionType {
    GAME {
        @Override
        public BigDecimal getDefaultPrice() {
            return new BigDecimal(150);
        }
    },
    CONTROLLER {
        @Override
        public BigDecimal getDefaultPrice() {
            return new BigDecimal(300);
        }
    },
    HEADSET {
        @Override
        public BigDecimal getDefaultPrice() {
            return new BigDecimal(450);
        }
    },
    CONTROLLER_CHARGER {
        @Override
        public BigDecimal getDefaultPrice() {
            return new BigDecimal(140);
        }
    },
    PILOT {
        @Override
        public BigDecimal getDefaultPrice() {
            return new BigDecimal(120);
        }
    },
    PSPLUS_1M {
        @Override
        public BigDecimal getDefaultPrice() {
            return new BigDecimal(20);
        }
    },
    PSPLUS_3M {
        @Override
        public BigDecimal getDefaultPrice() {
            return new BigDecimal(60);
        }
    },
    PSPLUS_12M {
        @Override
        public BigDecimal getDefaultPrice() {
            return new BigDecimal(240);
        }
    };

    public abstract BigDecimal getDefaultPrice();
}
