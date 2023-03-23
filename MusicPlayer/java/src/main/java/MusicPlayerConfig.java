import model.Song;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.ClassicMusicPlayer;
import service.MusicPlayerService;
import service.RockMusicPlayer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MusicPlayerConfig {
    @Bean
    public ClassicMusicPlayer classicMusicPlayer() {
        List<Song> classicSongList = new ArrayList<>();
        classicSongList.add(new Song("Цвіте терен", "folk song"));
        classicSongList.add(new Song("Ти ж мене підманула", "folk song"));
        return new ClassicMusicPlayer(classicSongList);
    }

    @Bean
    public RockMusicPlayer rockMusicPlayer() {
        List<Song> rockSongList = new ArrayList<>();
        rockSongList.add(new Song("Фортеця Бахмут", "Антитіла"));
        rockSongList.add(new Song("Струна", "Скай"));
        return new RockMusicPlayer(rockSongList);
    }

    @Bean
    public MusicPlayerService musicPlayerService(ClassicMusicPlayer classicMusicDaoImpl, RockMusicPlayer rockMusicDaoImpl) {
        return new MusicPlayerService(classicMusicDaoImpl, rockMusicDaoImpl);
    }
}
