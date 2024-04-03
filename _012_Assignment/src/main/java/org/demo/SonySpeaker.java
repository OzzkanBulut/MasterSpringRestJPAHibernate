package org.demo;

import org.springframework.stereotype.Component;

public class SonySpeaker implements SpeakerType{
    private String name="SonySpeaker";
    @Override
    public String play() {
        return "Sony is playing!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
