package features.songs.data;

import features.songs.domain.Song;
import features.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {

    @Override
    public ArrayList<Song> findAll() {
        Song song1 = new Song();
        song1.setId("1");
        song1.setTitle("Agua Pasa");
        song1.setArtist("SFDK y Kaze");
        song1.setDuration("3:30:00");

        Song song2 = new Song();
        song2.setId("2");
        song2.setTitle("Esa Niña Pija De Madrid");
        song2.setArtist("Pertegasss");
        song2.setDuration("4:00:00");

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);

        return songs;
    }


}
