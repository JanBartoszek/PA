package Java.Model.MediaItem.Movie;

import Java.Model.MediaItem.MediaItem;
import Java.Model.MediaItem.Interfaces.Watchable;

import java.util.Date;

public class Movie extends MediaItem implements Watchable {
    private int lengthInMinutes;
    private MovieGenre movieGenre;

    public Movie(String author, Date releaseDate, int lengthInMinutes, MovieGenre movieGenre) {
        super(author, releaseDate);
        this.lengthInMinutes = lengthInMinutes;
        this.movieGenre = movieGenre;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    @Override
    public void watch() {
        return;
    }
}
