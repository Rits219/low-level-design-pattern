package CarRentalSystem;

import CarRentalSystem.product.Vehicle;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    long bookingTime;
    long bookingTill;
    Location dropLocation;
    Location pickUpLocation;
    ReservationStatus reservationStatus;
    ReservationType reservationType;

    //create reservation
    //update reservation
    //remove reservation.
    int counter = 0;


    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public long getBookingTime() {
        return this.bookingTime;
    }

    public long getBookingTill() {
        return this.bookingTill;
    }

    public Reservation(User user, Vehicle vehicle, long bookingTime, long bookingTill, Location dropLocation,
                       Location pickUpLocation, ReservationStatus reservationStatus, ReservationType reservationType) {
        this.reservationId = counter++;
        this.user = user;
        this.vehicle = vehicle;
        this.bookingTime = bookingTime;
        this.bookingTill = bookingTill;
        this.dropLocation = dropLocation;
        this.pickUpLocation = pickUpLocation;
        this.reservationStatus = reservationStatus;
        this.reservationType = reservationType;
    }

    public Reservation doReserve(User user, Vehicle vehicle, long bookingTime, long bookingTill,
                                 Location dropLocation, Location pickUpLocation, ReservationStatus reservationStatus,
                                 ReservationType reservationType) {
        return new Reservation(user, vehicle, bookingTime, bookingTill, dropLocation,
                pickUpLocation, reservationStatus, reservationType);
    }

    public void updateReserve(Reservation reservation, ReservationStatus reservationStatus) {
        reservation.reservationStatus = reservationStatus;
    }
}
