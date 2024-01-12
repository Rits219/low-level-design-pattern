package DesignBookMyShow.model;

public class Seat {
    int seatId;
    double price;
    SeatCategory category;
    int row;

    public Seat(int seatId) {
        this.seatId = seatId;
    }
}
