package Trade;

import java.time.*;

public abstract class Trade {

    private String ID;
    private Symbol symbol;
    // private enum Symbol {AAPL,IBM};
    private int quantity;
    private double price;
    private LocalDate date = LocalDate.now();
    private LocalDateTime tradeTime;

    public Trade(String ID, Symbol symbol, int quantity, double price, LocalDateTime tradeTime) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.tradeTime = tradeTime;
    }

    public Trade(String ID, Symbol symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public abstract double calcDividend();

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return this.ID;
    }

    public Symbol getSymbol() {
        return this.symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public LocalDateTime getTradeTime() {
        return tradeTime;

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) throws Exception {
        if (price > 0)
            this.price = price;
        else {
            throw new Exception("negative");
        }
    }

    @Override
    public String toString() {
        return ("{" + " ID='" + getID() + "'" + ", symbol='" + getSymbol() + "'" + ", quantity='" + getQuantity() + "'"
                + ", price='" + getPrice() + "'" + "}");
    }

    // public static void main(String[] args) throws Exception {
    // Trade t2 = new Trade("T2", Symbol.AAPL, 100, 15.5);
    // System.out.println(t2.toString());
    // t2.setPrice(-4);
    // }
}
