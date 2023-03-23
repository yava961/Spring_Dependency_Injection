package service;

import dao.PlayerDao;
import model.Song;

import java.util.List;

public class RockMusicPlayer implements PlayerDao {
    private List<Song> rockSongList;

    public RockMusicPlayer(List<Song> rockSongList) {
        this.rockSongList = rockSongList;
    }

    @Override
    public void play() {
        System.out.println("Playing rock music: ");
        for (Song song : rockSongList) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

    }
}
