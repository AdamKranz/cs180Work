import java.*;
import java.util.Arrays;

/**
 * Created by akranz on 10/20/15.
 */
public class VehicleManagement {
    private int bus;
    private int plane;
    private int availableBus;
    private int availablePlanes;
    private Vehicle[] vehicles;

    public VehicleManagement(int bus, int plane) {
        this.bus = bus;
        this.plane = plane;
        vehicles = new Vehicle[0];
        availableBus = 0;
        availablePlanes = 0;
    }

    public int getCount() {
        return vehicles.length;
    }

    public boolean createRoute(Route route, int capacity) {
        if (bus < 1)
            return false;
        for (Vehicle v : vehicles)
            if (v.getRoute().equals(route))
                return false;
        if (availableBus >= bus)
            return false;
        vehicles = Arrays.copyOf(vehicles, vehicles.length + 1);
        Bus newBus = new Bus(route, capacity);
        vehicles[vehicles.length - 1] = newBus;
        availableBus++;
        return true;
    }

    public boolean addPassengerToVehicle(Passenger person) {
        if (person == null)
            return false;
        boolean arePlanes = false;
        if (availablePlanes < plane)
            arePlanes = true;
        if (lookupVehicle(person.getRoute()) != -1) {
            Vehicle v = vehicles[lookupVehicle(person.getRoute())];
            if (arePlanes) {
                if (!v.addPassenger(person)) {
                    person.cancel();
                    return false;
                }
                else {
                    if (v.getCount() >= 2 * v.getCapacity()) {
                        vehicles[lookupVehicle(person.getRoute())] = v.upgrade(v.getCapacity() * 3);
                        availablePlanes++;
                        availableBus--;
                        person.confirm();
                        return true;
                    }
                }
            }
            else {
                if (!v.addPassenger(person, false)) {
                    person.cancel();
                    return false;
                }
                return true;
            }
        }
        else {
            person.cancel();
            return false;
        } /*
        for (Vehicle v : vehicles) {
            if (v.getRoute().equals(person.getRoute())) {
                if (v instanceof Bus && v.getCount() >= 2 * v.getCapacity() && arePlanes) {
                    v = v.upgrade(v.getCapacity() * 3);
                    availablePlanes++;
                    availableBus--;
                    for (Passenger p : v.getPassengers()) {
                        p.confirm();
                    }
                    person.confirm();
                }
                if (v instanceof Airplane && v.getCount() >= v.getCapacity()) {
                    person.cancel();
                    availablePlanes--;
                    return false;
                }
                v.addPassenger(person);
                return true;
            }
        }
        return false; */
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
        return bus - availableBus;
    }

    public int getAvailablePlane() {
        return plane - availablePlanes;
    }
}
