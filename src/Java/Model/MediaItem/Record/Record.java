package Java.Model.MediaItem.Record;

import Java.Model.MediaItem.Interfaces.Listenable;
import Java.Model.MediaItem.MediaItem;

import java.util.Date;

public class Record extends MediaItem implements Listenable {
    private RecordGenre recordGenre;

    public Record(String author, Date releaseDate, RecordGenre recordGenre) {
        super(author, releaseDate);
        this.recordGenre = recordGenre;
    }

    public RecordGenre getRecordGenre() {
        return recordGenre;
    }

    @Override
    public void listen() {
        return;
    }
}
