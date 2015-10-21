import java.util.ArrayList;

/**
 * Created by akranz on 10/19/15.
 */
public interface Vehicle {
    int getCapacity();
    Route getRoute();
    int getCount();
    ArrayList<Passenger> getPassengers();
    boolean addPassenger(Passenger person, boolean WaitingList);
    boolean addPassenger(Passenger person);
    Vehicle upgrade(int capacity);
}