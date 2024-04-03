package org.demo;

import org.springframework.stereotype.Component;


public class BosseSpeaker implements SpeakerType{
    @Override
    public String play() {
        return "Bosse is playing!";
    }
}
