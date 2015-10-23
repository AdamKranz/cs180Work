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
    public boolean createRoute(Route route, int capacity) {
        for (Vehicle v : vehicles)
            if (v.getRoute().equals(route))
                return false;
        Vehicle[] v = new Vehicle[vehicles.length+1];
        System.arraycopy(vehicles, 0, v, 0, vehicles.length);
        vehicles = v;
        Bus newBus = new Bus(route, capacity);
        vehicles[vehicles.length-1] = newBus;
        return true;
    }
    public boolean addPassengerToVehicle(Passenger person) {

    }
}
