/**
 * Created by akranz on 10/20/15.
 */
public abstract class Product {
    private String productName;
    public Product(String productName) {
        this.productName = productName;
    }
    String getProductName() {
        return productName;
    }
    public abstract double getPrice();
}
