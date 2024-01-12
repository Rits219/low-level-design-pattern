package DesignBookMyShow.model;

public class Movie {
    private int movieId;
    private int movieDuration;    //this is in minutes.
    private String movieName;

    public Movie(int movieId, int movieDuration, String movieName) {
        this.movieId = movieId;
        this.movieDuration = movieDuration;
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }
}
