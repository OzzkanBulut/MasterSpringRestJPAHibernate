package org.demo;

import org.springframework.stereotype.Component;

@Component
public class AudiTyre implements TyreType{
    @Override
    public String moveVehicle() {
        return "Audi is moving the vehicle!";
    }
}
