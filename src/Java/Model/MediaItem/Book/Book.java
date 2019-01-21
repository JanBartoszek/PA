package Java.Model.MediaItem.Book;

import Java.Model.MediaItem.MediaItem;
import Java.Model.MediaItem.Interfaces.Readable;

import java.util.Date;

public class Book extends MediaItem implements Readable {
    private int numOfPages;
    private BookGenre bookGenre;

    public Book(String author, Date releaseDate, int numOfPages, BookGenre bookGenre) {
        super(author, releaseDate);
        this.numOfPages = numOfPages;
        this.bookGenre = bookGenre;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    @Override
    public void read() {
        return;
    }
}
