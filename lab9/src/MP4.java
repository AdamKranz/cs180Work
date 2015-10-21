import java.util.UUID;

/**
 * Created by akranz on 10/20/15.
 */
public class MP4 extends VideoProduct implements Downloadable {
    public MP4(String productName, VideoType type) {
        super(productName, type);
    }
    @Override
    public double getPrice() {
        if (this.getType() == VideoType.MOVIE)
            return 4.99;
        if (this.getType() == VideoType.TVSERIES)
            return 19.99;

        return 0.0;
    }
    @Override
    public String generateDownloadCode() {
        return UUID.randomUUID().toString();
    }
}
