package org.demo;

import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements SpeakerType{
    @Override
    public String playMusic(Song song) {
        return "Sony is playing "+ song.getSongName();

    }
}
