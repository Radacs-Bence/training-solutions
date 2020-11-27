package week05d05;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    List<Song> playlist;

    public Playlist(List<Song> playlist) {
        this.playlist = playlist;
    }

    public List<Song> findByLengthGreaterThan (int mins){
        List<Song> greaterThanSongs = new ArrayList<>();
        long lengthInSeconds = mins * 60;
        for (Song song: playlist) {
            if (lengthInSeconds < song.getLengthInSeconds()) {
                greaterThanSongs.add(song);
            }
        }

        return greaterThanSongs;
    }
}
