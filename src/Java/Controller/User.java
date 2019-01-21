package Java.Controller;

import Java.Model.MediaItem.MediaItem;
import Java.Model.Persistence.Mediatheque;
import Java.Model.Operator.Operator;
import Java.Model.Operator.Operators;

import java.util.ArrayList;
import java.util.List;

public class User extends Operator {

    List<MediaItem> rentedItems = new ArrayList<>();

    public User(Operators type, String name, Mediatheque mediatheque) {
        super(type, name, mediatheque);
    }

    public void preview(MediaItem mediaItem){
        return;
    }

    public MediaItem search(MediaItem mediaItem){
        return mediatheque.returnDesiredItem(mediaItem);
    }

    public void reserveItem(MediaItem itemToReserve){
        if (mediatheque.checkIfItemAvailable(itemToReserve)){
            itemToReserve.setAvailable(false);
        }
    }

    public void rentItem(MediaItem itemToRent){
        if (itemToRent.isAvailable()){
            itemToRent.setAvailable(false);
            rentedItems.add(itemToRent);
        }
    }

    public void returnItem(MediaItem itemToReturn){
        rentedItems.remove(itemToReturn);
        itemToReturn.setAvailable(true);
    }

}
