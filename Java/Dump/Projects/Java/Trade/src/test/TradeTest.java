package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Trade.*;
import Trade.Client.Client;
import Trade.TradeTypes.BondTrade;
import Trade.TradeTypes.FundTrade;


public class TradeTest {

    

    private static final double DELTA = 1e-15;

    // @Test
    // public void testTrade() {
    // Trade t1 = new Trade("T1", Symbol.IBM, 100, 15.25);
    // assertEquals("T1", t1.getID());

    // // Trade t1 = new Trade("T1",Symbol.IBM, 100, 15.25);
    // // assertEquals("T1",t1.getID());
    // }

    // @Test(expected = Exception.class)
    // public void testPositivePrice() throws Exception {
    // Trade t1 = new Trade("T1", Symbol.IBM, 100, 15.25);
    // t1.setPrice(-4);
    // }

    // @Test
    // public void testAddTrade() {
    // Trade t1 = new Trade("T1", Symbol.AAPL, 100, 2);
    // Trade t2 = new Trade("T2", Symbol.AAPL, 100, 2);
    // Trade t3 = new Trade("T3", Symbol.AAPL, 100, 2);

    // Account account1 = new Account();
    // Trader jojoe = new Trader("Jojoe", account1);

    // jojoe.addTrade(t1);
    // jojoe.addTrade(t2);
    // jojoe.addTrade(t3);

    // double result = jojoe.getTradeAccount().getTotalTrade();
    // System.out.println(result);
    // assertEquals(400.0,result,DELTA);
    // }

    // @Test
    // @Tag("Bond Trade")
    // public void testBondTradeDividend() {
    // BondTrade BD1 = new BondTrade("BD1", Symbol.AAPL, 4, 2.00, 1000.00);
    // assertEquals(1000.00, BD1.calcDividend(), DELTA);

    // }

    // @Test
    // @Tag("Fund Trade")
    // public void testFundTradeDividend() {
    // FundTrade FD1 = new FundTrade("FD1", Symbol.AAPL, 4, 2.00, 1.00);
    // System.out.println(FD1.calcDividend());
    // assertEquals(50.00, FD1.calcDividend(), DELTA);

    // }

    // @Test
    // public void testMembershipPoints() {
    // FundTrade FD1 = new FundTrade("FD1", Symbol.AAPL, 4, 2.00, 1.00);
    // Client cl1 = new Client("Emmanuel", "Ainoo");

    // for (int i = 0; i < 11; i++) {
    // String tradeName = "FD" + i + "";
    // FD1 = new FundTrade(tradeName, Symbol.AAPL, 4, 2.00, 1.00);
    // System.out.println(FD1.toString());
    // cl1.addPoints(FD1);
    // }

    // System.out.println(cl1.getMembershipType().getStatus());
    // assertEquals("SILVER", cl1.getMembershipType().getStatus());
    // }

}
