package ent.pks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
     private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void doInit() {
        System.out.println("MusicPlayer Init");
    }

    public void doDestroy() {
        System.out.println("MusicPlayer Destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(GenreOfMusic genreOfMusic) {
        Random random = new Random();
        String songToPlaying = "No song to play";
        List<String> songs;
        switch (genreOfMusic) {
            case POP:
                songs = new PopMusic().getSongs();
                songToPlaying = songs.get(random.nextInt(songs.size()));
                break;

            case ROCK:
                songs = new RockMusic().getSongs();
                songToPlaying = songs.get(random.nextInt(songs.size()));
                break;

            case CLASSIC:
                songs = new ClassicalMusic().getSongs();
                songToPlaying = songs.get(random.nextInt(songs.size()));
                break;
        }

        System.out.println(songToPlaying);
    }
}
