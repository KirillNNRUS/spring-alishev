package ent.pks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(GenreOfMusic.ROCK);
        musicPlayer.playMusic(GenreOfMusic.CLASSIC);
        musicPlayer.playMusic(GenreOfMusic.POP);

        musicPlayer.setVolume(33);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}
