package Trade.Client;

import Trade.Symbol;
import Trade.Trade;
import Trade.TradeTypes.FundTrade;
import java.time.*;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membershipType; // status
    private int points;
    private static final int BRONZE_LIMIT = 5;
    private static final int GOLD_LIMIT = 20;
    private int numOfTrades;
    private int silverLimit = 10;

    public Client(String firstName, String lastName) {
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
    public MembershipType getMembershipType() {
        return membershipType;
    }

    /**
     * @param membershipType the membershipType to set
     */
    public void setMembershipType() {
        if (this.points > 0 && this.points < 10)
            this.membershipType = new Bronze();
        else if (this.points >= 10 && this.points <= 19)
            this.membershipType = new Silver();
        else if (this.points >= 20)
            this.membershipType = new Gold();

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

    public void setSilverLimit(int limit) {
        if (this.getMembershipType().getStatus() == "SILVER" && limit <= 10)
            this.silverLimit = limit;

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
        if (newTrade.getTradeTime().isBefore(this.getMembershipType().getStartTradeTime()))
            return false;
        if (this.getMembershipType().getStatus() == "BRONZE" && numOfTrades >= BRONZE_LIMIT)
            return false;

        else if (this.getMembershipType().getStatus() == "SILVER" && numOfTrades >= silverLimit)
            return false;

        else if (this.getMembershipType().getStatus() == "GOLD" && numOfTrades >= GOLD_LIMIT)
            return false;

        return true;
    }

    public static void main(String[] args) throws Exception {
        LocalDate date1 = LocalDate.now();
        LocalDateTime datetime = date1.atTime(9, 50, 9);
        FundTrade FD1 = new FundTrade("FD1", Symbol.AAPL, 4, 2.00, 1.00, datetime);
        // FD1 = new FundTrade("FD2", Symbol.AAPL, 4, 2.00, 1.00);

        Client cl1 = new Client("Emmanuel", "Ainoo");

        for (int i = 0; i < 5; i++) {
            String tradeName = "FD" + i + "";
            FD1 = new FundTrade(tradeName, Symbol.AAPL, 4, 2.00, 1.00, datetime);
            System.out.println(FD1.toString());
            cl1.addPoints(FD1);
        }

        System.out.println(cl1.membershipType.getStatus());

        // Check if Client can Trade
        System.out.println(cl1.canTrade(FD1));

    }

}
