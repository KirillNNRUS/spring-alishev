package ent.pks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(GenreOfMusic.POP);

        musicPlayer.setVolume(33);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}
