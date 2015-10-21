import java.util.UUID;

/**
 * Created by akranz on 10/20/15.
 */
public class MP3 extends AudioProduct implements Downloadable {
    private String productName;
    public MP3(String productName) {
        super(productName, 1);
    }
    public double getPrice() {
        return 0.99;
    }
    public String generateDownloadCode() {
        return   UUID.randomUUID().toString();
    }
}
