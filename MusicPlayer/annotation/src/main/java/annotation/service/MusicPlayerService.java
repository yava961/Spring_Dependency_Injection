package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerService {
    private ClassicMusicPlayer classicMusicPlayer;
    private RockMusicPlayer rockMusicPlayer;

    @Autowired
    public MusicPlayerService(ClassicMusicPlayer classicMusicPlayer, RockMusicPlayer rockMusicPlayer) {
        this.classicMusicPlayer = classicMusicPlayer;
        this.rockMusicPlayer = rockMusicPlayer;
    }

    public void playClassicMusic() {
        classicMusicPlayer.play();
    }

    public void playRockMusic() {
        rockMusicPlayer.play();
    }
}
