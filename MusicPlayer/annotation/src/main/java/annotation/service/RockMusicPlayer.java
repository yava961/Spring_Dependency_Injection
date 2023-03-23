package annotation.service;

import annotation.dao.PlayerDao;
import annotation.model.Song;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusicPlayer implements PlayerDao {
    private List<Song> rockSongList;

    public RockMusicPlayer(List<Song> rockSongList) {
        this.rockSongList = rockSongList;
    }

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
