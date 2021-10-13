package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MontrealTradedProductsV2 implements MontrealTradedProducts {

    private List<Product> productList;

    public MontrealTradedProductsV2() {
        this.productList = new ArrayList<Product>();

    }

    public void addNewProduct(Product newProduct) throws ProductAlreadyRegisteredException {
        // use streams - check if product already exists with optional type

        Optional<Product> product = this.productList.stream().filter(p -> p.getID().equals(newProduct.getID()))
                .findFirst();
        if (!product.isPresent()) {
            throw new ProductAlreadyRegisteredException("Product: " + newProduct.getID() + "Already Exists");
        }
        this.productList.add(newProduct);
    }

    public void trade(Product product, int quantity) {
    }

}
