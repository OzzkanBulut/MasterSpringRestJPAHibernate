package org.demo;

import org.springframework.stereotype.Component;

@Component
public class BosseSpeaker implements SpeakerType{
    @Override
    public String playMusic(Song song) {
        return "Bosse speaker is playing "+song.getSongName();

    }
}
