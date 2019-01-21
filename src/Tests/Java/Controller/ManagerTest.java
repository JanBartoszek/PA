package Java.Controller;

import Java.Model.MediaItem.Book.Book;
import Java.Model.MediaItem.Book.BookGenre;
import Java.Model.Operator.Operators;
import Java.Model.Persistence.Mediatheque;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Mediatheque mediatheque;

    Manager manager1;

    User user1;
    User user2;

    Book book1;
    Book book2;


    @BeforeEach
    void setUp() {
        mediatheque = new Mediatheque();
        manager1 = new Manager(Operators.MANAGER, "Janek", mediatheque);

        user1 = new User(Operators.USER, "Adam", mediatheque);
        user2 = new User(Operators.USER, "Mirek", mediatheque);

        book1 = new Book("author1", new Date(), 100, BookGenre.DRAMA);
        book2 = new Book("author1", new Date(), 100, BookGenre.FANTASY);
    }

    @org.junit.jupiter.api.Test
    void addItem() {

        assertEquals(mediatheque.getMediaItems().size(), 0);

        manager1.addItem(book1);

        assertEquals(mediatheque.getMediaItems().size(), 1);
        assertEquals(mediatheque.getMediaItems().get(0), book1);

        manager1.addItem(book2);

        assertEquals(mediatheque.getMediaItems().size(), 2);


    }

    @org.junit.jupiter.api.Test
    void removeItem() {

        manager1.addItem(book1);
        manager1.addItem(book2);

        manager1.removeItem(book2);

        assertEquals(mediatheque.getMediaItems().size(), 1);
    }

    @org.junit.jupiter.api.Test
    void addUser() {

        assertEquals(mediatheque.getUsers().size(), 0);

        manager1.addUser(user1);

        assertEquals(mediatheque.getUsers().size(), 1);
        assertEquals(mediatheque.getUsers().get(0), user1);

        manager1.addUser(user2);

        assertEquals(mediatheque.getUsers().size(), 2);

    }

    @org.junit.jupiter.api.Test
    void removeUser() {

        manager1.addUser(user1);
        manager1.addUser(user2);

        manager1.removeUser(user2);

        assertEquals(mediatheque.getUsers().size(), 1);
    }

    @org.junit.jupiter.api.Test
    void editItemAuthor() {

        manager1.addItem(book1);

        assertEquals(mediatheque.getMediaItems().get(0).getAuthor(), book1.getAuthor());

        manager1.editItemAuthor(book1, "Mickiewicz");

        assertEquals(mediatheque.getMediaItems().get(0).getAuthor(), "Mickiewicz");
    }

    @org.junit.jupiter.api.Test
    void editRelaseDate() {

        Date otherDate = new Date();

        manager1.addItem(book1);

        assertEquals(mediatheque.getMediaItems().get(0).getReleaseDate(), book1.getReleaseDate());

        manager1.editRelaseDate(book1, otherDate);

        assertEquals(mediatheque.getMediaItems().get(0).getReleaseDate(), otherDate);
    }
}