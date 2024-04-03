package org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    private String name="Vehicle Service";
    private final SpeakerType speakerType;
    private final TireType tireType;

    @Autowired
    public VehicleServices(@Qualifier("sonySpeaker") SpeakerType speakerType,
                           @Qualifier("bridgeStoneTire")TireType tireType) {
        this.speakerType = speakerType;
        this.tireType = tireType;
    }

    public String play(){
        return speakerType.play();
    }
    public String rotate(){
        return tireType.rotate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpeakerType getSpeakerType() {
        return speakerType;
    }

    public TireType getTireType() {
        return tireType;
    }
}
