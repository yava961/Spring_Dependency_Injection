import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import annotation.service.MusicPlayerService;


public class RunMusicPlayer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationMusicPlayerConfig.class);
        MusicPlayerService musicPlayer = context.getBean(MusicPlayerService.class);
        musicPlayer.playClassicMusic();
        musicPlayer.playRockMusic();
    }
}
