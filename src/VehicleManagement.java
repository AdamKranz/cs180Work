import java.*;
import java.util.Arrays;

/**
 * Created by akranz on 10/20/15.
 */
public class VehicleManagement {
    private int bus;
    private int plane;
    private Vehicle[] vehicles;
    public VehicleManagement(int bus, int plane) {
        this.bus = bus;
        this.plane = plane;
        vehicles = new Vehicle[0];
    }
    public int getCount() {
        if (vehicles.length == 0)
            return 0;
        int counter = 0;
        for (Vehicle count : vehicles) {
            if (count != null)
                counter++;
        }
        return counter;
    }
    public boolean createRoute(Route route, int capacity) {
        for (Vehicle v : vehicles)
            if (v.getRoute().equals(route))
                return false;
        int busCount = 0;
        for (Vehicle b : vehicles) {
            if (b instanceof Bus)
                busCount++;
        }
        if (busCount == bus)
            return false;
        Vehicle[] v = new Vehicle[vehicles.length+1];
        System.arraycopy(vehicles, 0, v, 0, vehicles.length);
        vehicles = v;
        Bus newBus = new Bus(route, capacity);
        vehicles[vehicles.length-1] = newBus;
        return true;
    }
    public boolean addPassengerToVehicle(Passenger person) {
        if (person == null)
            return false;
        boolean availablePlanes = false;
        int planeCount = 0;
        for (Vehicle q : vehicles) {
            if (q instanceof Airplane)
                planeCount++;
        }
        if (planeCount < plane)
            availablePlanes = true;
        for (Vehicle v : vehicles) {
            if (v.getRoute().equals(person.getRoute())) {
               if (v instanceof Bus && v.getCount() >= 2*v.getCapacity() && availablePlanes) {
                   v = v.upgrade(v.getCount()*3);
               }
                v.addPassenger(person);
                return true;
            }
        }
        return false;
    }
    public Vehicle[] getVehicles() {
        Vehicle[] get = new Vehicle[getCount()];
        System.arraycopy(vehicles, 0, get, 0, vehicles.length);
        return get;
    }
    public int lookupVehicle(Route route) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getRoute().equals(route))
                return i;
        }
        return -1;
    }
    public int getAvailableBus() {
        int numBus = 0;
        for (Vehicle bus : vehicles)
            if (bus instanceof Bus && bus.getCount() < 2*bus.getCapacity())
                numBus++;
        return numBus;
    }
    public int getAvailablePlane() {
        int numPlane = 0;
        for (Vehicle daPlane : vehicles)
            if (daPlane instanceof Airplane && daPlane.getCount() < 2*daPlane.getCapacity())
                numPlane++;
        return numPlane;
    }
}
