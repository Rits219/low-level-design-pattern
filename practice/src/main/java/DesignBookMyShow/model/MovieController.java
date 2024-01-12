package DesignBookMyShow.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MovieController {
    Map<String, List<Movie>> cityVsMovies;
    List<Movie> allMovies;

    public MovieController() {
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    //crud operation of adding,removing city to that movie
    public void addMovie(String city, Movie movie) {
        List<Movie> cityVsMoviesList = cityVsMovies.get(city) == null ? new ArrayList<>() : cityVsMovies.get(city);
        cityVsMoviesList.add(movie);
        cityVsMovies.put(city, cityVsMoviesList);
        allMovies.add(movie);
    }

    public void removeMovie(String city, Movie movie) {
        List<Movie> cityVsMoviesList = cityVsMovies.get(city);
        if (cityVsMoviesList.contains(movie)) {
            cityVsMoviesList.remove(movie);
        }
    }

    public Movie getMovieByMovieName(String movieName) {
        for (Movie movie : allMovies
        ) {
            if (Objects.equals(movie.getMovieName(), movieName)) {
                return movie;
            }
        }
        return null;
    }

    public Movie getMovieByCityName(String movieName) {
        for (Movie movie : allMovies
        ) {
            if (Objects.equals(movie.getMovieName(), movieName)) {
                return movie;
            }
        }
        return null;
    }


    public List<Movie> getMovieByCity(String city) {
        return cityVsMovies.get(city);
    }

    public Movie searchMovie(String city, String movieName) {
        List<Movie> movies = getMovieByCity(city);
        Movie interestedMovie = null;
        for (Movie movie : movies
        ) {
            if (Objects.equals(movie.getMovieName(), movieName)) {
                interestedMovie = movie;
            }
        }
        return interestedMovie;
    }
}
