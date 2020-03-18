package ent.pks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(
            @Qualifier("rockMusic") Music music1,
            @Qualifier("classicalMusic") Music music2,
            @Qualifier("popMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
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
