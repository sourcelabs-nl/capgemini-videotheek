package nl.rickenarno.video.rental.library;
import static org.junit.Assert.*;

import org.junit.Test;

public class VideoRentalTest {

    @Test
    public void shouldRentMovie() {
        Movie[] allTheMoviesInTheWorld = { new Movie("Jurassic Park"), new Movie("Titanic", 180) };
        VideoRental videoRental = new VideoRental(allTheMoviesInTheWorld);

        //TODO create test
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotRentMovieThatDoesNotExist() {
        Movie[] allTheMoviesInTheWorld = { new Movie("Jurassic Park"), new Movie("Titanic", 180) };
        VideoRental videoRental = new VideoRental(allTheMoviesInTheWorld);

        //TODO create test
    }

}
