package Product;

public class Future extends Product {

    private String exchange;
    private String contractCode;
    private int month;
    private int year;

    private ProductPricingService productPricingService;

    public Future() {
    }

    public Future(String exchange, String contractCode, ProductPricingService productPricingService) {
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.productPricingService = productPricingService;
    }

    public String getExchange() {
        return this.exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getContractCode() {
        return this.contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public double getPrice() {
        return this.productPricingService.price(exchange, contractCode, month, year);
    }

    @Override
    public String toString() {
        return "{" + " exchange='" + getExchange() + "'" + ", contractCode='" + getContractCode() + "'"
                + ", productPricingService='" + getPrice() + "'" + "}";
    }

    /**
     * @return int return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

}
