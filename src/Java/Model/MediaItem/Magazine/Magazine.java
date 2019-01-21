package Java.Model.MediaItem.Magazine;

import Java.Model.MediaItem.MediaItem;
import Java.Model.MediaItem.Interfaces.Readable;

import java.util.Date;

public class Magazine extends MediaItem implements Readable {
    private Periodicity periodicity;
    private MagazineGenre magazineGenre;

    public Magazine(String author, Date releaseDate, Periodicity periodicity, MagazineGenre magazineGenre) {
        super(author, releaseDate);
        this.periodicity = periodicity;
        this.magazineGenre = magazineGenre;
    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public MagazineGenre getMagazineGenre() {
        return magazineGenre;
    }

    @Override
    public void read() {
        return;
    }
}
