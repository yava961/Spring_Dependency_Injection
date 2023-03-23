import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.service.MusicPlayerService;

public class RunMusicPlayer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("XMLMusicPlayerConfig.xml");
        MusicPlayerService musicPlayer = context.getBean(MusicPlayerService.class);
        musicPlayer.playClassicMusic();
        musicPlayer.playRockMusic();
    }
}
