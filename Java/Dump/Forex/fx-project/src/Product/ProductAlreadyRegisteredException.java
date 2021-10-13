package Product;

public class ProductAlreadyRegisteredException extends Exception {

    public ProductAlreadyRegisteredException(String str) {
        super(str);
    }

    public String getMessage() {
        return super.getMessage();
    }

}
