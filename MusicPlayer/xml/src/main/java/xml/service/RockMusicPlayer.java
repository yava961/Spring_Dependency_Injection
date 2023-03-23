package xml.service;

import jakarta.annotation.PostConstruct;
import xml.dao.PlayerDao;
import xml.model.Song;

import java.util.ArrayList;
import java.util.List;


public class RockMusicPlayer implements PlayerDao {
    private List<Song> rockSongList;

    @PostConstruct
    public void init() {
        rockSongList = new ArrayList<>();
        rockSongList.add(new Song("Фортеця Бахмут", "Антитіла"));
        rockSongList.add(new Song("Струна", "Скай"));
    }

    @Override
    public void play() {
        System.out.println("Playing rock music: ");
        for (Song song : rockSongList) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

    }
}
