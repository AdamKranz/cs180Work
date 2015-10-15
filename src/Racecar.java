/**
 * Created by akranz on 10/14/15.
 */
public class Racecar extends Car {
    private int speed;
    public Racecar(String make, int speed) {
        super(make);
        this.speed = speed;
    }
    public void race() {
        super.drive();
        System.out.println("VROOM!");
    }

    public int getSpeed() {
        return speed;
    }
}
