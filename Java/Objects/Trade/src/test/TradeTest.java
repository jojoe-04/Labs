package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Trade.*;

public class TradeTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testTrade() {
        Trade t1 = new Trade("T1", Symbol.IBM, 100, 15.25);
        assertEquals("T1", t1.getID());

        // Trade t1 = new Trade("T1",Symbol.IBM, 100, 15.25);
        // assertEquals("T1",t1.getID());
    }

    @Test(expected = Exception.class)
    public void testPositivePrice() throws Exception {
        Trade t1 = new Trade("T1", Symbol.IBM, 100, 15.25);
        t1.setPrice(-4);
    }

    @Test
    public void testAddTrade() {
        Trade t1 = new Trade("T1", Symbol.AAPL, 100, 2);
        Trade t2 = new Trade("T2", Symbol.AAPL, 100, 2);
        Trade t3 = new Trade("T3", Symbol.AAPL, 100, 2);
        
        Account account1 = new Account();
        Trader jojoe = new Trader("Jojoe", account1);
        
        jojoe.addTrade(t1);
        jojoe.addTrade(t2);
        jojoe.addTrade(t3);
        
        double result = jojoe.getTradeAccount().getTotalTrade();
        System.out.println(result);
        assertEquals(400.0,result,DELTA);
    }

    
    public void testTrader(){}
}

