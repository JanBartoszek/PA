package Model.MediaItem.Magazine;

import Model.MediaItem.MediaItem;
import Model.MediaItem.Interfaces.Readable;

import java.util.Date;

public class Magazine extends MediaItem implements Readable {
    private Periodicity periodicity;
    private MagazineGenre magazineGenre;

    public Magazine(String author, Date releaseDate, Periodicity periodicity, MagazineGenre magazineGenre) {
        super(author, releaseDate);
        this.periodicity = periodicity;
        this.magazineGenre = magazineGenre;
    }

    @Override
    public void read() {
        return;
    }
}
