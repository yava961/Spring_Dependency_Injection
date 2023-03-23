package annotation.service;

import annotation.dao.PlayerDao;
import annotation.model.Song;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusicPlayer implements PlayerDao {

    private List<Song> classicSongList;

    public ClassicMusicPlayer(List<Song> classicSongList) {
        this.classicSongList = classicSongList;
    }

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
