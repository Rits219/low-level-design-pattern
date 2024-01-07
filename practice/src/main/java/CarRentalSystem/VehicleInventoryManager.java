package CarRentalSystem;

import CarRentalSystem.product.Vehicle;
import CarRentalSystem.product.VehicleStatus;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManager {
    int storeId;
    List<Vehicle> vehicleList;

    public VehicleInventoryManager(int storeId) {
        this.vehicleList = new ArrayList<>();
        this.storeId = storeId;
    }

    //crud operation of adding and removing vehicles from particular store.

    public void add(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void remove(Vehicle vehicle) {
        vehicleList.remove(vehicle);
    }

    public Vehicle get(int vehicleNumber) {
        for (Vehicle vehicle : vehicleList
        ) {
            if (vehicle.getVehicleNumber() == vehicleNumber) {
                if (vehicle.getVehicleStatus() == VehicleStatus.INACTIVE) {
                    System.out.println("not in active state");
                } else {
                    return vehicle;
                }
            }
        }
        return null;
    }
}
