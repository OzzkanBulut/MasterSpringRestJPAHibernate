package org.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements SpeakerType{
    @Override
    public String playMusic(Song song) {
        return "Sony Speaker is playing "+song.getName()+" song";
    }
}
