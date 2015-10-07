/**
 * Created by akranz on 10/6/15.
 */
public class Bird implements Animal {
    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public int numberOfLegs() {
        return 2;
    }

    @Override
    public String makeNoise() {
        return "Caw!";
    }

}
