package Java.Controller;

import Java.Model.MediaItem.MediaItem;
import Java.Model.Persistence.Mediatheque;
import Java.Model.Operator.Operator;
import Java.Model.Operator.Operators;

import java.util.Date;

public class Manager extends Operator {
    public Manager(Operators type, String name, Mediatheque mediatheque) {
        super(type, name, mediatheque);
    }

    public void addItem(MediaItem itemToAdd){
        mediatheque.addMediaItem(type, itemToAdd);
    }

    public void removeItem(MediaItem itemToRemove){
        mediatheque.removeMediaItem(type, itemToRemove);
    }

    public void addUser(User user){
        mediatheque.addUser(type, user);
    }

    public void removeUser(User user){
        mediatheque.removeUser(type, user);
    }

    public void editItemAuthor(MediaItem itemToEdit, String author){
        itemToEdit.setAuthor(type, author);
    }

    public void editRelaseDate(MediaItem itemToEdit, Date date){
        itemToEdit.setReleaseDate(type, date);
    }


}
