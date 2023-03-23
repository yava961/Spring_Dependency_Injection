package xml.service;

public class MusicPlayerService {
    private ClassicMusicPlayer classicMusicDaoImpl;
    private RockMusicPlayer rockMusicDaoImpl;

    public MusicPlayerService(ClassicMusicPlayer classicMusicDaoImpl, RockMusicPlayer rockMusicDaoImpl) {
        this.classicMusicDaoImpl = classicMusicDaoImpl;
        this.rockMusicDaoImpl = rockMusicDaoImpl;
    }

    public void playClassicMusic() {
        classicMusicDaoImpl.play();
    }

    public void playRockMusic() {
        rockMusicDaoImpl.play();
    }
}
