package org.demo;

import org.springframework.stereotype.Component;

@Component
public class ferrariTyre implements TyreType{
    @Override
    public String moveVehicle() {
        return "ferrari is moving the vehicle!";
    }
}
