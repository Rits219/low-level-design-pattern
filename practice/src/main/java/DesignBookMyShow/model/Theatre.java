package DesignBookMyShow.model;

import java.util.List;

public class Theatre {
    private int theatreId;
    private String city;
    private List<Screen> screens;
    private List<Show> shows;

    public Theatre(int theatreId, String city, List<Screen> screens, List<Show> shows) {
        this.theatreId = theatreId;
        this.city = city;
        this.screens = screens;
        this.shows = shows;
    }

    public String getCity() {
        return city;
    }

    public List<Show> getShows() {
        return shows;
    }
}
