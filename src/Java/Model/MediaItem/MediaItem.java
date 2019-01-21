package Java.Model.MediaItem;

import Java.Model.Operator.Operators;

import java.util.Date;

public abstract class MediaItem {
    private String author;
    private java.util.Date releaseDate;
    private boolean available;

    public MediaItem(String author, Date releaseDate) {
        this.author = author;
        this.releaseDate = releaseDate;
        this.available = true;
    }

    public String getAuthor() {
        return author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAuthor(Operators operator, String author) {
        if (operator.equals(Operators.MANAGER)) {
            this.author = author;
        }
    }

    public void setReleaseDate(Operators operator, Date releaseDate) {
        if (operator.equals(Operators.MANAGER)) {
            this.releaseDate = releaseDate;
        }
    }
}
