package Model.MediaItem.Book;

import Model.MediaItem.MediaItem;
import Model.MediaItem.Interfaces.Readable;

import java.util.Date;

public class Book extends MediaItem implements Readable {
    private int numOfPages;
    private BookGenre bookGenre;

    public Book(String author, Date releaseDate, int numOfPages, BookGenre bookGenre) {
        super(author, releaseDate);
        this.numOfPages = numOfPages;
        this.bookGenre = bookGenre;
    }

    @Override
    public void read() {
        return;
    }
}
