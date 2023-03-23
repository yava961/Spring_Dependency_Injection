package service;

import dao.PlayerDao;
import model.Song;

import java.util.List;

public class ClassicMusicPlayer implements PlayerDao {
    private List<Song> classicSongList;

    public ClassicMusicPlayer(List<Song> classicSongList) {
        this.classicSongList = classicSongList;
    }

    @Override
    public void play() {
        System.out.println("Playing classic music: ");
        for (Song song : classicSongList) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

    }
}
