package org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class VehicleServices {
    private final SpeakerType speakerType;
    private Logger logger = Logger.getLogger(VehicleServices.class.getName());

    @LogAspect
    public String playMusic(){
        return speakerType.playMusic();

    }
    @Autowired
    public VehicleServices(SpeakerType speakerType) {
        this.speakerType = speakerType;
    }


    public SpeakerType getSpeakerType() {
        return speakerType;
    }
}
