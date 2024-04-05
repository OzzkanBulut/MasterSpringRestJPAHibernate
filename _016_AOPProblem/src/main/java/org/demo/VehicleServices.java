package org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleServices {
    private final TireType tireType;
    private final SpeakerType speakerType;
    private String name;
    private Logger logger = Logger.getLogger(VehicleServices.class.getName());
    @Autowired
    public VehicleServices(@Qualifier("bridgestoneTire") TireType tireType,@Qualifier("bosseSpeaker") SpeakerType speakerType){
        this.tireType = tireType;
        this.speakerType = speakerType;
    }
/*
If you look at the 3 methods below, there are lots of code unrelated to actual business logic.
There are codes of logging, security checks and codes to see how much time is passed for
that method.All these codes are making the application hard to understand for another developer.
If you want to add a new condition like vehicleStarted, you will have to make the changes in
all of the methods.This is not good! This is where Aspect Oriented Programming Comes!*/
/*Using AOP programming, all non-business logic can be moved from outside of this class to a single place.
And we can define that as an aspect and we can tell spring framework how to execute that aspect whenever
some is trying to acces the methods below!*/
    public String playMusic(boolean vehicleStarted, Song song){
        Instant start = Instant.now();
        logger.info("method execution start");
        String music = null;
        if(vehicleStarted){
            music = speakerType.playMusic(song);
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the playMusic() operation");
            throw new NullPointerException("There is no music!");
        }
        logger.info("method execution ended");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time took to execute the method: "+timeElapsed);
        return music;
    }
    public String moveVehicle(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("method execution start");
        String status =null;
        if(vehicleStarted){
            status = tireType.moveVehicle();
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the moveVehicle operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time elapsed for this method: "+timeElapsed);
        return status;
    }
    public String applyBreak(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("method execution start");
        String status =null;
        if(vehicleStarted){
            status = tireType.applyBreak();
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the applyBreak operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time elapsed for this method: "+timeElapsed);
        return status;
    }

    public TireType getTireType() {
        return tireType;
    }

    public SpeakerType getSpeakerType() {
        return speakerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
