package service;

public class MusicPlayerService {
    private ClassicMusicPlayer classicMusicPlayer;
    private RockMusicPlayer rockMusicPlayer;

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
