package CarRentalSystem;

import CarRentalSystem.product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManager vehicleInventoryManager;
    Location location;
    List<Reservation> reservationList;

    public Store(int storeId, Location location) {
        this.storeId = storeId;
        this.vehicleInventoryManager = new VehicleInventoryManager(storeId);
        this.location = location;
        this.reservationList = new ArrayList<>();
    }


    //crud on reservation.
    //crud on vehicle.

    public void add(Vehicle vehicle) {
        vehicleInventoryManager.add(vehicle);
    }

    public void remove(Vehicle vehicle) {
        vehicleInventoryManager.remove(vehicle);
    }

    public Vehicle get(int vehicleNumber) {
        //all filtering logic
        return vehicleInventoryManager.get(vehicleNumber);
    }

    public Reservation doReserve(User user, Vehicle vehicle, long bookingTime, long bookingTill, Location dropLocation,
                                 Location pickUpLocation, ReservationStatus reservationStatus, ReservationType reservationType) {
        Reservation reservation = new Reservation(user, vehicle, bookingTime, bookingTill, dropLocation,
                pickUpLocation, reservationStatus, reservationType);
        reservationList.add(reservation);
        return reservation;
    }

    public void updateReservation(Reservation reservation, ReservationStatus reservationStatus) throws Exception {
        for (Reservation obj : reservationList
        ) {
            if (obj.reservationId == reservation.reservationId) {
                reservation.updateReserve(reservation, reservationStatus);
            }
        }
        throw new Exception("Invalid reservation");
    }


}
