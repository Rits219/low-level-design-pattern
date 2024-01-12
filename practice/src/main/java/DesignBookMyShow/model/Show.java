package DesignBookMyShow.model;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    int startTime;
    List<Seat> bookedSeats;
    Screen screen;

    public Show(int showId, Movie movie, int startTime, Screen screen) {
        this.showId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.bookedSeats = new ArrayList<>();
        this.screen = screen;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }
}
