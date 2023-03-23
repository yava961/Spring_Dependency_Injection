package xml.service;

import jakarta.annotation.PostConstruct;
import xml.dao.PlayerDao;
import xml.model.Song;

import java.util.ArrayList;
import java.util.List;


public class ClassicMusicPlayer implements PlayerDao {
    private List<Song> classicSongList;

    @PostConstruct
    public void init() {
        classicSongList = new ArrayList<>();
        classicSongList.add(new Song("Цвіте терен", "folk song"));
        classicSongList.add(new Song("Ти ж мене підманула", "folk song"));
    }

    @Override
    public void play() {
        System.out.println("Playing classic music: ");
        for (Song song : classicSongList) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

    }
}
