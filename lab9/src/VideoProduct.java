/**
 * Created by akranz on 10/20/15.
 */
public abstract class VideoProduct extends Product {
    private VideoType type;
    public VideoProduct(String productName, VideoType type) {
        super(productName);
        this.type = type;
    }
    public VideoType getType() {
        return type;
    }
}
