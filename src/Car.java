/**
 * Created by akranz on 10/15/15.
 */
public class Car {
    private int fuel;
    private int distance;
    public Car (int fuel) {
        this.fuel = fuel;
        distance = 0;
    }
    public void drive (int distance) throws InsufficientFuelException {
        if (fuel < (distance / 20.0))
            throw new InsufficientFuelException("Fuel too low!");
        else {
            fuel -= distance / 20;
            this.distance += distance;
        }
    }

}
