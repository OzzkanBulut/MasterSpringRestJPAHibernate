package org.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ProjectConfig {

    @Bean
    public SpeakerType sonySpeaker(){
        SpeakerType sony = new SonySpeaker();
        return sony;
    }
    @Bean
    public SpeakerType bosseSpeaker(){
        SpeakerType bosse = new BosseSpeaker();
        return bosse;
    }

    @Bean
    public TireType michelinTire(){
        TireType michelin = new MichelinTire();
        return michelin;
    }

    @Bean
    public TireType bridgeStoneTire(){
        TireType bridge = new BridgeStoneTire();
        return bridge;
    }
}
