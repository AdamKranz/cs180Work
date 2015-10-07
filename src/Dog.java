/**
 * Created by akranz on 10/6/15.
 */
public class Dog implements Animal {
    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public String makeNoise() {
        return "Bark!";
    }
}
