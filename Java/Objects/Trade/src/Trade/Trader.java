package Trade;

public class Trader {
    private String name;
    private Account tradeAccount;




    public Trader(String name, Account tradeAccount) {
        this.name = name;
        this.tradeAccount = tradeAccount;
    }


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Account return the tradeAccount
     */
    public Account getTradeAccount() {
        return tradeAccount;
    }

    /**
     * @param tradeAccount the tradeAccount to set
     */
    public void setTradeAccount(Account tradeAccount) {
        this.tradeAccount = tradeAccount;
    }

       /**
     * Adds trade values to this account.
     * @param newTrade Trade Object
     */
    public void addTrade(Trade newTrade) {
        double tradeValue = newTrade.getPrice() * newTrade.getQuantity();
        this.tradeAccount.totalTrade += tradeValue;
    }

    // public static void main(String[] args) {
    //     Trade t1 = new Trade("T1", Symbol.AAPL, 100, 2);
    //     Trade t2 = new Trade("T2", Symbol.AAPL, 100, 2);
    //     Trade t3 = new Trade("T3", Symbol.AAPL, 100, 2);
    //     Account account1 = new Account();
    //     Trader jojoe = new Trader("Jojoe", account1);
    //     jojoe.addTrade(t1);
    //     jojoe.addTrade(t2);
    //     System.out.println(jojoe.getTradeAccount().totalTrade);
    // }

    

}
