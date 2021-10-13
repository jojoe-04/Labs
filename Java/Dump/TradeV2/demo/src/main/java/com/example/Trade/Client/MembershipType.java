package com.example.Trade.Client;

import java.time.*;

public class MembershipType {
    // status = bronze, silver , gold,
    private String status;

    private LocalDate date = LocalDate.now();
    private LocalDateTime startTradeTime;

    public MembershipType(String status) {
        this.status = status;
        this.startTradeTime = date.atTime(10, 00, 00);
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getStartTradeTime() {
        return startTradeTime;
    }

}
