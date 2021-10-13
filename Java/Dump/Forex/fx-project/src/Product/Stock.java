package Product;

public class Stock extends Product {

    private String ticker;
    private String exchange;
    private ProductPricingService productPricingService;

    public Stock() {
    }

    public Stock(String Id, String ticker, String exchange, ProductPricingService productPricingService) {
        super(Id);
        this.ticker = ticker;
        this.exchange = exchange;
        this.productPricingService = productPricingService;
    }

    public String getTicker() {
        return this.ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getExchange() {
        return this.exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public double getPrice() {
        return this.productPricingService.price(exchange, ticker);
    }

    @Override
    public String toString() {
        return "{" + " ticker='" + getTicker() + "'" + ", exchange='" + getExchange() + "'"
                + ", productPricingService='" + getPrice() + "'" + "}";
    }

}
