import java.util.ArrayList;

/**
 * Created by akranz on 10/20/15.
 */
public class VehicleManagement {
    private int busMax;
    private int planeMax;
    private ArrayList<Vehicle> vehicles;

    public VehicleManagement(int bus, int plane) {
        busMax = bus;
        planeMax = plane;
        vehicles = new ArrayList<>();
    }

    public boolean createRoute(Route route, int capacity) {
        Bus b = new Bus(route, capacity);
        if (vehicles.size()>0) {
            for (int i = 0; i < vehicles.size(); i++) {
                return !vehicles.get(i).getRoute().equals(b.getRoute());
            }
        }
        return true;
    }
    public boolean addPassengerToVehicle(Passenger person) {
        for (Vehicle v : vehicles) {
            if (person.getRoute().equals(v.getRoute())) {
                   return v.addPassenger(person);
            }
        }
        return false;
    }
}
