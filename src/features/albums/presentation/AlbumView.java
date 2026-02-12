package features.albums.presentation;

import features.albums.data.AlbumDataRepository;
import features.albums.domain.Album;
import features.albums.domain.GetAlbumUseCase;

import java.util.ArrayList;

public class AlbumView {
    public static void printAlbum(){
        GetAlbumUseCase getAlbumUseCase = new GetAlbumUseCase(new AlbumDataRepository());
        ArrayList<Album> albumList = getAlbumUseCase.execute();
    }
}
