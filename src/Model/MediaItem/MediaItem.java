package Model.MediaItem;

import java.util.Date;

public class MediaItem {
    private String author;
    private java.util.Date releaseDate;

    public MediaItem(String author, Date releaseDate) {
        this.author = author;
        this.releaseDate = releaseDate;
    }
}
