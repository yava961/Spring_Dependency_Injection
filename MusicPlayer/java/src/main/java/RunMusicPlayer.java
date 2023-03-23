import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MusicPlayerService;

public class RunMusicPlayer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MusicPlayerConfig.class);
        MusicPlayerService musicPlayer = context.getBean(MusicPlayerService.class);
        musicPlayer.playClassicMusic();
        musicPlayer.playRockMusic();
    }
}
