/**
 * Created by akranz on 10/6/15.
 */
public class Mosquito implements Animal {
    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public int numberOfLegs() {
        return 6;
    }

    @Override
    public String makeNoise() {
        return "Buzz!";
    }
}
