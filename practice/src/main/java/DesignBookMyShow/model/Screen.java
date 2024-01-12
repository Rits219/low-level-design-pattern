package DesignBookMyShow.model;

import java.util.List;

public class Screen {
    int screenId;
    List<Seat> seats;

    public Screen(int screenId, List<Seat> seats) {
        this.screenId = screenId;
        this.seats = seats;
    }
}
