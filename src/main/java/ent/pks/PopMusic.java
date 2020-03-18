package ent.pks;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PopMusic implements Music {
    private List<String> songs = Arrays.asList("Pop song 01",
            "Pop song 02",
            "Pop song 03");

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
