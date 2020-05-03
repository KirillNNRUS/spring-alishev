package ent.pks;

import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {
    private List<String> songs = Arrays.asList("Rock song 01",
            "Rock song 02",
            "Rock song 03");

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
