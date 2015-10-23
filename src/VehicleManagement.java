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
        if (route.equals(null))
            return false;
        for (Vehicle v : vehicles) {
            if (v.getRoute().equals(route))
                return false;
        }
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
                   if (v.addPassenger(person)) {
                       if (v.getPassengers().length>=v.getCapacity()*2) {
                           boolean hasAirplane = false;
                           for (Vehicle s : vehicles) {
                               if (s instanceof Airplane)
                                   hasAirplane = true;
                           }
                           if (hasAirplane) {
                               v.upgrade(v.getCapacity()*3);
                           }
                       }
                   }
            }
        }
        return false;
    }
    public Vehicle[] getVehicles() {
        Vehicle[] v = new Vehicle[vehicles.size()];
        return vehicles.toArray(v);
    }
    public int getCount() {
        return vehicles.size();
    }
    public int lookupVehicle(Route route) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getRoute().equals(route))
                return i;
        }
        return -1;
    }
    public int getAvailableBus() {
        int busCount = 0;
        for (Vehicle v : vehicles) {
            if (v instanceof Bus)
                busCount++;
        }
        return busCount;
    }
    public int getAvailablePlane() {
        int planeCount = 0;
        for (Vehicle v : vehicles) {
            if (v instanceof Airplane)
                planeCount++;
        }
        return planeCount;
    }

}
