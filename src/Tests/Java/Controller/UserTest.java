package Java.Controller;

import Java.Model.MediaItem.Book.Book;
import Java.Model.MediaItem.Book.BookGenre;
import Java.Model.Operator.Operators;
import Java.Model.Persistence.Mediatheque;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    Mediatheque mediatheque;
    User user1;
    Book book1;

    @BeforeEach
    void setUp() {
        mediatheque = new Mediatheque();
        user1 = new User(Operators.USER, "Adam", mediatheque);
        book1 = new Book("author1", new Date(), 100, BookGenre.DRAMA);
    }

    @Test
    void reserveItem() {

        assertEquals(book1.isAvailable(), true);

        user1.reserveItem(book1);

        assertEquals(book1.isAvailable(), false);
    }

    @Test
    void rentItem() {

        assertEquals(user1.getRentedItems().size(), 0);

        user1.rentItem(book1);

        assertEquals(user1.getRentedItems().size(), 1);
    }

    @Test
    void returnItem() {

        user1.rentItem(book1);

        assertEquals(user1.getRentedItems().size(), 1);

        user1.returnItem(book1);

        assertEquals(user1.getRentedItems().size(), 0);
    }
}