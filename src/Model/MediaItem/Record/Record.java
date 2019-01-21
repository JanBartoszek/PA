package Model.MediaItem.Record;

import Model.MediaItem.Interfaces.Listenable;
import Model.MediaItem.MediaItem;

import java.util.Date;

public class Record extends MediaItem implements Listenable {
    private RecordGenre recordGenre;

    public Record(String author, Date releaseDate, RecordGenre recordGenre) {
        super(author, releaseDate);
        this.recordGenre = recordGenre;
    }

    @Override
    public void listen() {
        return;
    }
}
