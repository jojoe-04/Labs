package test;

import static org.mockito.Mockito.*;
import Trade.*;
import Trade.Symbol;
import Trade.TradeTypes.FundTrade;

public class MockitoTest {

    public static void main(String[] args) {

        FundTrade FD1 = new FundTrade("FD1", Symbol.AAPL, 4);
        System.out.println("Test Mockito");

        MallonExchange mallonMock = mock(MallonExchange.class);
        when(mallonMock.getPrice(Symbol.AAPL, 5)).thenReturn(2.00);

        // System.out.println(mallonMock);
    }

}
