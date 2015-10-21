/**
 * Created by akranz on 10/20/15.
 */
public class DVD extends VideoProduct {
    private double price;
    public DVD(String productName, VideoType type, double price) {
        super(productName, type);
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
