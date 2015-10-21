/**
 * Created by akranz on 10/20/15.
 */
public abstract class AudioProduct extends Product {
    private String productName;
    private int totalSongs;
    public AudioProduct(String productName, int totalSongs) {
        super(productName);
        this.totalSongs = totalSongs;
    }
    public int getTotalSongs() {
        return totalSongs;
    }
}
