package Trade.TradeTypes;

import Trade.Symbol;
import Trade.Trade;
import java.time.*;

public class FundTrade extends Trade {

    private double dividend;

    public FundTrade(String ID, Symbol symbol, int quantity, double price, double dividendPercent,
            LocalDateTime tradeTime) {
        super(ID, symbol, quantity, price, tradeTime);
        setDividend(dividendPercent);
    }

    public double getDividend() {
        return this.dividend;
    }

    public void setDividend(double dividendPercent) {
        // System.out.println(this.dividend / this.getPrice());
        this.dividend = (dividendPercent / this.getPrice()) * 100;
    }

    public double calcDividend() {
        return this.getDividend();
        // return (double) (this.dividend / this.getPrice());
    }

    // public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");
    // FundTrade FD1 = new FundTrade("FD1", Symbol.AAPL, 4, 2.00, 10.00);
    // System.out.println(FD1.calcDividend());
    // }
}
