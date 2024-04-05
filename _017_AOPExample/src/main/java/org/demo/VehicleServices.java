package org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    private final SpeakerType speakerType;
    private final TireType tireType;
    private final Song song;

    @Autowired
    public VehicleServices(SpeakerType speakerType,TireType tireType,Song song) {
        this.speakerType = speakerType;
        this.tireType = tireType;
        this.song = song;
    }

    public String playMusic(Song song){
        return speakerType.playMusic(song);
    }

    public String moveVehicle(boolean vehicleStarted) throws Exception {
//        return tireType.moveVehicle(vehicleStarted);
    throw new Exception("Exception occured!");
    }
}
