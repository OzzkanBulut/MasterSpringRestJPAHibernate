package org.demo;

import org.springframework.stereotype.Component;

@Component
public class Song {
    private String songName;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
