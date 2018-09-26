package nl.rickenarno.video.rental.library;

public class VideoRental {

    private Movie[] movies;

    public VideoRental(final Movie[] movies) {
        this.movies = movies;
    }

    public void getAllMovies() {
        for (Movie movie : movies) {
            System.out.println(movie.getDetails());
        }
    }

    public Movie rentMovie(String title) {
        for (final Movie movie : movies) {
            if(title.equals(movie.getTitle())) {
                movie.isRented(true);
                return movie;
            }
        }
        throw new RuntimeException("Deze titel: " + title + " bestaat niet");
    }

    public void returnMovie(final Movie movie) {
        movie.isRented(false);
        System.out.println("Film is terug gebracht");
    }
}
