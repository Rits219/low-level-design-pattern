package DesignBookMyShow.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<String, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatres;

    public TheatreController() {
        cityVsTheatre = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    public void addTheatre(String city, Theatre theatre) {
        List<Theatre> cityVsTheatreList = cityVsTheatre.get(city) == null ? new ArrayList<>() : cityVsTheatre.get(city);
        cityVsTheatreList.add(theatre);
        cityVsTheatre.put(city, cityVsTheatreList);
        allTheatres.add(theatre);
    }

    public Map<Theatre, List<Show>> getAllShow(String city, Movie movie) {
        Map<Theatre, List<Show>> theatreVsShow = new HashMap<>();
        List<Theatre> theatres = cityVsTheatre.get(city);
        for (Theatre theatre : theatres
        ) {
            List<Show> showList = theatre.getShows();
            List<Show> movieShows = new ArrayList<>();
            for (Show show : showList
            ) {
                if (show.getMovie() == movie) {
                    movieShows.add(show);
                }
            }
            if (!movieShows.isEmpty()) {
                theatreVsShow.put(theatre, movieShows);
            }
        }
        return theatreVsShow;
    }
}
