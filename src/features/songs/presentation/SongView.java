package features.songs.presentation;

import features.songs.data.SongDataRepository;
import features.songs.domain.GetSongsUseCase;
import features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {
    public static void printSong() {

        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongDataRepository());
        ArrayList<Song> songList = getSongsUseCase.execute();

        System.out.println(songList);

    }
}
