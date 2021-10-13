package com.example.Trade.Client;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.Trade.Symbol;
import com.example.Trade.Trade;
import com.example.Trade.TradeTypes.FundTrade;

public class ClientV2 {
    private String firstName;
    private String lastName;
    private MembershipTypeEnum membershipType; // status
    private int points;
    private int numOfTrades;

    public ClientV2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMembershipType();
        this.points = 0;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return MembershipType return the membershipType
     */
    public MembershipTypeEnum getMembershipType() {
        return membershipType;
    }

    /**
     * @param membershipType the membershipType to set
     */
    public void setMembershipType() {
        if (this.points > 0 && this.points < 10)
            this.membershipType = MembershipTypeEnum.BRONZE;
        else if (this.points >= 10 && this.points <= 19)
            this.membershipType = MembershipTypeEnum.SILVER;
        else if (this.points >= 20)
            this.membershipType = MembershipTypeEnum.GOLD;

    }

    /**
     * @return int return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }

    public void setNumTrades(int numTrades) {
        this.numOfTrades = numTrades;
    }

    public void addPoints(Trade newTrade) {

        // check if you can trade points
        // after adding trade you add points
        this.points++;
        setMembershipType();

    }

    public void addTrade(Trade newTrade) {

    }

    public boolean canTrade(Trade newTrade) {
        System.out.println("Client belongs to the " + getMembershipType() + " MembershipType");
        if (newTrade.getTradeTime().isBefore(this.getMembershipType().getTimeLimit())) {

            System.out.println("Trades cannot be happen before " + this.getMembershipType().getTimeLimit());
            return false;
        }

        if (numOfTrades >= this.getMembershipType().getMaxTrades()) {
            System.out.println(
                    "This trade cannot be added because this Client has reached it's membershipType number of limits: "
                            + this.getMembershipType().getMaxTrades());
            return false;
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        LocalDate date1 = LocalDate.now();
        LocalDateTime datetime = date1.atTime(11, 50, 9);
        FundTrade FD1 = new FundTrade("FD1", Symbol.AAPL, 4, 2.00, 1.00, datetime);
        // FD1 = new FundTrade("FD2", Symbol.AAPL, 4, 2.00, 1.00);

        ClientV2 cl1 = new ClientV2("Emmanuel", "Ainoo");

        for (int i = 0; i < 15; i++) {
            String tradeName = "FD" + i + "";
            FD1 = new FundTrade(tradeName, Symbol.AAPL, 4, 2.00, 1.00, datetime);
            System.out.println(FD1.toString());
            cl1.addPoints(FD1);
        }

        // set num of trades for now
        cl1.setNumTrades(5);

        // Check if Client can Trade
        System.out.println(" ");
        System.out.println(cl1.canTrade(FD1));

    }

}