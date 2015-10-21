/**
 * Created by akranz on 10/20/15.
 */
public class CD extends AudioProduct {
    private String productName;
    private int totalSongs;
    private double price;
    public CD(String productName, int totalSongs, double price) {
        super(productName, totalSongs);
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
