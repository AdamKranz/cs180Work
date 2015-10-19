/**
 * Created by akranz on 10/19/15.
 */
public class Bus implements Vehicle {
    private Passenger[] passengers;
    private int passengerCount;
    private int capacity;
    private Route route;

    public Bus(Route route) {
        this.route = route;
        capacity = 2;
        passengers = new Passenger[getCount()];
        passengerCount = 0;
    }
    public Bus(Route route, int capacity) {
        this.route = route;
        this.capacity = capacity;
        passengers = new Passenger[getCount()];
        passengerCount = 0;
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
    public Passenger[] getPassengers() {
        return passengers;
    }

    @Override
    public boolean addPassenger(Passenger person, boolean WaitingList) {
        return false;
    }

    @Override
    public boolean addPassenger(Passenger person) {
        return false;
    }

    @Override
    public Vehicle upgrade(int capacity) {
        return null;
    }
}
