package Product;

public abstract class Product {

    private String ID;

    public Product() {
    }

    public Product(String ID) {
        this.ID = ID;

    }

    /**
     * 
     * @return String ID of the Product
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Sets new
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    public Product ID(String ID) {
        setID(ID);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " ID='" + getID() + "'" + ", value='" + getPrice() + "'" + "}";
    }

    public abstract double getPrice();

}
