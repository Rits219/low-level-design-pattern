package CarRentalSystem;

import CarRentalSystem.product.Vehicle;
import CarRentalSystem.product.VehicleStatus;
import CarRentalSystem.product.VehicleType;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws Exception {
        //have two stores.
        int locationId = 0;
        Location sarjapurLocation = new Location(locationId++, "Bengaluru", "sarjapur Road", "Karnataka", 560035);
        Location bellandurLocation = new Location(locationId++, "Bengaluru", "Belandur Road", "Karnataka", 560099);

        int storeId = 0;
        Store sarjapurStore = new Store(storeId++, sarjapurLocation);
        Store bellandurStore = new Store(storeId++, bellandurLocation);

        //have two vehicles in sarjapurStore.
        int vehicleId = 0;
        Vehicle vehicle1 = new Vehicle(vehicleId++, VehicleType.CAR, 123456, 500, 100, VehicleStatus.ACTIVE);
        Vehicle vehicle2 = new Vehicle(vehicleId++, VehicleType.CAR, 123457, 500, 100, VehicleStatus.ACTIVE);

        //adding vehicle in sarjapur store
        sarjapurStore.add(vehicle1);
        sarjapurStore.add(vehicle2);

        //now new user comes.
        int userId = 0;
        User sawan = new User(userId++, "sawan", 1234565432);

        //user selects sarjapurStore
        //user search for vehicle number
        Vehicle sawanVehicle = sarjapurStore.get(123456);
        if (sawanVehicle == null) {
            System.out.println("vehicle is not present");
        }

        //user reserves this vehicle.
        long currentTimestamp = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimestamp);
        calendar.add(Calendar.HOUR_OF_DAY, 5);
        long updatedTimestamp = calendar.getTimeInMillis();
        Reservation reservation = sarjapurStore.doReserve(sawan, sawanVehicle, currentTimestamp, updatedTimestamp,
                sarjapurLocation, sarjapurLocation, ReservationStatus.SCHEDULED, ReservationType.HOURLY);

        int billId = 0;
        Bill bill = new Bill(billId++, reservation);

        int paymentId = 0;
        Payment payment = new Payment(paymentId++, bill);
        payment.payBill(bill.amount);


    }
}
