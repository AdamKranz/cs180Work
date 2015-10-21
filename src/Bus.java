import java.util.ArrayList;

/**
 * Created by akranz on 10/19/15.
 */
public class Bus implements Vehicle {
    private ArrayList<Passenger> passengers;
    private int passengerCount;
    private int capacity;
    private Route route;

    public Bus(Route route) {
        this.route = route;
        capacity = 2;
        passengers = new ArrayList<>();
        passengerCount = passengers.size();
    }
    public Bus(Route route, int capacity) {
        this.route = route;
        this.capacity = capacity;
        passengers = new ArrayList<>();
        passengerCount = passengers.size();
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
        return passengerCount;
    }

    @Override
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public boolean addPassenger(Passenger person, boolean WaitingList) {
        if (WaitingList == false) {
            if (passengers.size() == capacity)
                return false;
        }
        else {
            if (passengers.size() == capacity && person.getRoute().equals(this.getRoute())) {
                passengers.add(person);
                return true;
            }
            if (person.getRoute().equals(this.getRoute())) {
                passengers.add(person);
                person.confirm();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addPassenger(Passenger person) {
        return addPassenger(person,true);
    }

    @Override
    public Vehicle upgrade(int capacity) {
        Vehicle a = new Airplane(getRoute(), capacity);
        for (Passenger p : passengers) {
            a.addPassenger(p);
        }
        return a;
    }
}
