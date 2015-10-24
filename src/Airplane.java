import java.util.Arrays;

/**
 * Created by akranz on 10/20/15.
 */
public class Airplane implements Vehicle {
    private Route route;
    private int capacity;
    private int count;
    private Passenger[] passengers;
    public Airplane(Route route, int capacity) {
        this.route = route;
        this.capacity = capacity;
        count = 0;
        passengers = new Passenger[0];
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
    public Passenger[] getPassengers() {
        return passengers;
    }

    @Override
    public boolean addPassenger(Passenger person) {
        if (person == null) {
            return false;
        }
        if (count == capacity) {
            person.cancel();
            return false;
        }
        if (!(person.getRoute().equals(route))) {
            person.cancel();
            return false;
        }
        else {
            if (count == passengers.length) {
                Passenger[] p = Arrays.copyOf(passengers, passengers.length + 1);
                passengers = p;
            }
            passengers[count] = person;
            count++;
            if (count <= capacity) {
                person.confirm();
            }
            return true;
        }
    }
    @Override
    public boolean addPassenger(Passenger person, boolean waitingList) {
        return addPassenger(person);
    }
    @Override
    public Vehicle upgrade(int capacity) {
        return null;
    }
}
