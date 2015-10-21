import java.util.ArrayList;

/**
 * Created by akranz on 10/20/15.
 */
public class Airplane implements Vehicle {
    private int capacity;
    private Route route;
    private int count;
    private ArrayList<Passenger> passengers;

    public Airplane(Route route, int capacity) {
        this.capacity = capacity;
        this.route = route;
        count = passengers.size();
        passengers = new ArrayList<>();
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public Route getRoute() {
        return route;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public boolean addPassenger(Passenger person, boolean WaitingList) {
        if (passengers.size() == capacity)
                return false;
        if (person.getRoute().equals(this.getRoute())) {
            passengers.add(person);
            person.confirm();
            return true;
        }
        return false;
    }



    @Override
    public boolean addPassenger(Passenger person) {
        return addPassenger(person, false);
    }

    @Override
    public Vehicle upgrade(int capacity) {
        return null;
    }
}
