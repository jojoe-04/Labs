package com.example.Trade.Client;

import java.time.LocalDate;
import java.time.LocalDateTime;

public enum MembershipTypeEnum {

    BRONZE(5, LocalDate.now().atTime(10, 00, 00)), SILVER(10, LocalDate.now().atTime(10, 00, 00)),
    GOLD(20, LocalDate.now().atTime(10, 00, 00));

    private int maxTrades;
    private LocalDateTime timeLimit;

    private MembershipTypeEnum(int maxTrades, LocalDateTime timeLimit) {

        this.maxTrades = maxTrades;
        this.timeLimit = timeLimit;

    }

    public int getMaxTrades() {
        return this.maxTrades;
    }

    public LocalDateTime getTimeLimit() {
        return this.timeLimit;
    }

}
