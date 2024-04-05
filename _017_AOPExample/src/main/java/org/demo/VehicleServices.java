package org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    private final SpeakerType speakerType;
    private final Song song;

    @Autowired
    public VehicleServices(SpeakerType speakerType,Song song) {
        this.speakerType = speakerType;
        this.song = song;
    }

    public String playMusic(Song song){
        return speakerType.playMusic(song);
    }
}
