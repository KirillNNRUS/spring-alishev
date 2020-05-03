package ent.pks;

import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music {
    private List<String> songs = Arrays.asList("Classical song 01",
            "Classical song 02",
            "Classical song 03");

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
