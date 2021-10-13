package Product;

public interface MontrealTradedProducts {

    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException;

    public void trade(Product product, int quantity);

    public int totalQuantityPerDay();

    public double todayTotalValue();

}
