package DesignBookMyShow.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.Initialize();
        bookMyShow.createBoking(City.Bengaluru.name(), MovieName.BAHUBALI.name());
    }

    private void createBoking(String city, String movieName) {
        //search movie by movie location
        Movie searchMovieInCity = movieController.searchMovie(city, movieName);
        if (searchMovieInCity == null) {
            System.out.println("no movie in this city");
            return;
        }

        //get all show of the interestedMovie in that city
        Map<Theatre, List<Show>> showsTheatreWise = theatreController.getAllShow(city, searchMovieInCity);

        //select particular show user is interested in
        Map.Entry<Theatre, List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShow = entry.getValue();
        Show interestedShow = runningShow.get(0);

        //select the seat
        Seat interestedSeat = new Seat(30);
        List<Seat> bookedSeats = interestedShow.getBookedSeats();

        if (bookedSeats.contains(interestedSeat)) {
            System.out.println("seat is already booked,pls select another seat");
        }
        //book this seat
        bookedSeats.add(interestedSeat);
        Booking booking = new Booking(1, interestedShow, new Payment(1, false, 20.0), List.of(interestedSeat));

        System.out.println("booking is successfull");

    }

    public void Initialize() {
        //add movies in the cities;
        createMovies();
        createTheatres();


    }

    private void createTheatres() {
        Movie bahubaliMovie = movieController.getMovieByMovieName(MovieName.BAHUBALI.name());
        Movie avengerMovie = movieController.getMovieByMovieName(MovieName.AVENGER.name());
        Screen screen1 = new Screen(1, new ArrayList<>());
        Screen screen2 = new Screen(2, new ArrayList<>());
        List<Screen> screenList = List.of(screen1, screen2);
        Show show1 = new Show(1, bahubaliMovie, 8, screen1);
        Show show2 = new Show(2, avengerMovie, 16, screen2);
        List<Show> showList = List.of(show1, show2);
        Theatre theatre1 = new Theatre(1, City.Bengaluru.name(), screenList, showList);

        Screen screen3 = new Screen(3, new ArrayList<>());
        Screen screen4 = new Screen(4, new ArrayList<>());
        screenList = List.of(screen3, screen4);
        Show show3 = new Show(3, bahubaliMovie, 8, screen3);
        Show show4 = new Show(4, avengerMovie, 16, screen4);
        showList = List.of(show3, show4);
        Theatre theatre2 = new Theatre(1, City.Hyderabad.name(), screenList, showList);

        theatreController.addTheatre(theatre1.getCity(), theatre1);
        theatreController.addTheatre(theatre2.getCity(), theatre2);
    }

    private void createMovies() {
        Movie bahubaliMovie = new Movie(1, 180, MovieName.BAHUBALI.name());
        Movie avengerMovie = new Movie(2, 240, MovieName.AVENGER.name());

        movieController.addMovie(City.Bengaluru.name(), bahubaliMovie);
        movieController.addMovie(City.Hyderabad.name(), bahubaliMovie);
        movieController.addMovie(City.Hyderabad.name(), avengerMovie);
        movieController.addMovie(City.Hyderabad.name(), avengerMovie);
    }
}
