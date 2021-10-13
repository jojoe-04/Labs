package test;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import Product.*;

public class ProductV2Test {
    public Product product;
    public ProductPricingService productPricingService;

    private static final double DELTA = 1e-15;

    @BeforeEach
    public void setup() {
        product = mock(Product.class);
        // when(product.getId()).thenReturn("12");

        this.productPricingService = mock(ProductPricingService.class);
        when(productPricingService.price("exchange", "ticker")).thenReturn(2.0);
    }

    // @Test
    // public void rawtest() {
    // product
    // }

    @Test
    public void testStockPrice() {
        System.out.println("Testing getPrice() of Stocks");
        Stock stock1 = new Stock("24", "ticker", "exchange", this.productPricingService);
        assertEquals(2.0, stock1.getPrice(), DELTA);
    }

}
