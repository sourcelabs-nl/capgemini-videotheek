package nl.rickenarno.video.rental.library;

public class Movie {

    private String title;
    private int durationInMinutes;
    private boolean isRented;

    public Movie() {
    }

    public Movie(String title, int durationInMinutes) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.isRented = false;
    }

    public Movie(String title) {
        this(title, 120);
    }

    public String getDetails() {
        return title + " : " + durationInMinutes + " minuten";
    }

    public String getTitle() {
        return title;
    }

    public void watch() {
        if(isRented) {
            System.out.println("film " + title + " speelt");
        } else {
            System.out.println("U heeft deze film niet gehuurd");
        }
    }

    public void isRented(boolean rented) {
        isRented = rented;
    }
}
