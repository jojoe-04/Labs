package test;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Trade.*;
import Trade.TradeTypes.FundTrade;

public class MockitoTest {

    @Mock
    public MallonExchange mallonMock;
    public FundTrade FundTrade;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        this.mallonMock = mock(MallonExchange.class);

        // set fund trade mallon
        FundTrade.setMallonExchange(mallonMock);

        when(this.mallonMock.getPrice(Symbol.AAPL, 5)).thenReturn(2.00);

    }

    @Test
    public void testFundTrade() {
        System.out.println("Test Mockito");
        FundTrade FD1 = new FundTrade("FD1", Symbol.AAPL, 4);
        FundTrade FD2 = new FundTrade("FD2", Symbol.AAPL, 5);

        // mcok beavior
        when(this.mallonMock.getPrice(Symbol.AAPL, 5)).thenReturn(2.00);

        // double value = this.

        // System.out.println(mallonMock.getTodos("dummy"));

        // when(mallonMock.getPrice(Symbol.AAPL, 5)).thenReturn(2.00);

        // List<String> combinedlist = Arrays.asList(" Use Core Java ", " Use SpringCore
        // ", " Use w3eHibernate ",
        // " Use Spring MVC ");
        // when(mallonMock.getTodos("dummy")).thenReturn(combinedlist);

        System.out.println(this.mallonMock.getPrice(Symbol.AAPL, 5));
    }

}
