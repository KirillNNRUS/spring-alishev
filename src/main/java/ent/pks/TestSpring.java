package ent.pks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        PopMusic popMusic = context.getBean("popBean", PopMusic.class);
//        RockMusic rockMusic = context.getBean("rockBean", RockMusic.class);
//        ClassicalMusic classicalMusic = context.getBean("classicBean", ClassicalMusic.class);
//
//        musicPlayer.setMusicList(popMusic);
//        musicPlayer.setMusicList(rockMusic);
//        musicPlayer.setMusicList(classicalMusic);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
