package nl.rickenarno.video.rental;

import nl.rickenarno.video.rental.library.Movie;
import nl.rickenarno.video.rental.library.VideoRental;

public class ArnoAndRickStore {

    public static void main(String[] args) {

        Movie[] allTheMoviesInTheWorld = { new Movie("Jurassic Park"), new Movie("Titanic", 180) };

        VideoRental arnoAndRickVideoRental = new VideoRental(allTheMoviesInTheWorld);

        arnoAndRickVideoRental.getAllMovies();

        Movie movie = arnoAndRickVideoRental.rentMovie(args[0]);

        movie.watch();

        arnoAndRickVideoRental.returnMovie(movie);

        movie.watch();

    }
}
