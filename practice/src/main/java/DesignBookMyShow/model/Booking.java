package DesignBookMyShow.model;


import java.util.ArrayList;
import java.util.List;

public class Booking {
    private int bookingId;
    Show show;
    Payment payment;
    List<Seat> bookedSeats = new ArrayList<>();

    public Booking(int bookingId, Show show, Payment payment, List<Seat> bookedSeats) {
        this.bookingId = bookingId;
        this.show = show;
        this.payment = payment;
        this.bookedSeats = bookedSeats;
    }
}
