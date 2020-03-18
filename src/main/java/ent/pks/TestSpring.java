package ent.pks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayerSec = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
        musicPlayer.setVolume(30);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayerSec.getName());
        System.out.println(musicPlayerSec.getVolume());

        context.close();
    }
}
