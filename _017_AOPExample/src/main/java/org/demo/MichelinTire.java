package org.demo;

import org.springframework.stereotype.Component;

@Component
public class MichelinTire implements TireType{
    @Override
    public String moveVehicle(boolean vehicleStarted) {
        return "Michelin tire moves the vehicle";
    }
}
