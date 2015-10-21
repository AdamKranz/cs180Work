/**
 * Created by akranz on 10/19/15.
 */
public class Route {
    private String from;
    private String to;
    public Route(String from, String to) {
        this.from = from;
        this.to = to;
    }
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof Route) {
            Route r = (Route) obj;
            if (r.to.equals(this.to) && r.from.equals(this.from))
                return true;
        }
        return false;
    }
}
