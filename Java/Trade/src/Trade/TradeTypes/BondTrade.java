package Trade.TradeTypes;

import Trade.Symbol;
import Trade.Trade;
import java.time.*;

public class BondTrade extends Trade {
    private double dividend;

    public BondTrade(String ID, Symbol symbol, int quantity, double price, double fixedDividend,
            LocalDateTime tradeTime) {
        super(ID, symbol, quantity, price, tradeTime);
        this.dividend = fixedDividend;
    }

    /**
     * @return double calculated dividend
     */
    public double calcDividend() {
        return this.dividend;
        // return (double) (this.dividend / this.getPrice());
    }

    /**
     * @return double return the dividend
     */
    public double getDividend() {
        return dividend;
    }

    /**
     * @param dividend the dividend to set
     */
    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

}
