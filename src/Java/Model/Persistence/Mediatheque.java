package Java.Model.Persistence;

import Java.Controller.User;
import Java.Model.MediaItem.MediaItem;
import Java.Model.Operator.Operators;

import java.util.ArrayList;
import java.util.List;

public class Mediatheque {
    private List<MediaItem> mediaItems = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public List<MediaItem> getMediaItems() {
        return mediaItems;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addMediaItem(Operators operator, MediaItem mediaItem){
        if (operator.equals(Operators.MANAGER)) {
            mediaItems.add(mediaItem);
        }
    }

    public void removeMediaItem(Operators operator, MediaItem mediaItem){
        if (operator.equals(Operators.MANAGER)) {
            if (checkIfItemInDatabase(mediaItem)) {
                mediaItems.remove(mediaItem);
            }
        }
    }

    public MediaItem returnDesiredItem(MediaItem itemToReturn){
        int indexOf = mediaItems.indexOf(itemToReturn);
        return mediaItems.get(indexOf);
    }

    private boolean checkIfItemInDatabase(MediaItem mediaItem){
        return mediaItems.contains(mediaItem);
    }

    public boolean checkIfItemAvailable(MediaItem itemToBeChecked){
        return itemToBeChecked.isAvailable();
    }


    public void addUser(Operators operator, User user){
        if (operator.equals(Operators.MANAGER)) {
            users.add(user);
        }
    }

    public void removeUser(Operators operator, User user){
        if (operator.equals(Operators.MANAGER)) {
            if (checkIfUserInDatabse(user)) {
                users.remove(user);
            }
        }
    }

    private boolean checkIfUserInDatabse(User user){
        return users.contains(user);
    }





}
