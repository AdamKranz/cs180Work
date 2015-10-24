import java.util.ArrayList;

/**
 * Created by akranz on 10/19/15.
 */
public interface Vehicle {
    int getCapacity();
    Route getRoute();
    int getCount();
    Passenger[] getPassengers();
    boolean addPassenger(Passenger person, boolean waitingList);
    boolean addPassenger(Passenger person);
    Vehicle upgrade(int capacity);
}
