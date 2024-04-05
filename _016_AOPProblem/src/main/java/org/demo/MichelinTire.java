package org.demo;

import org.springframework.stereotype.Component;

@Component
public class MichelinTire implements TireType{
    @Override
    public String moveVehicle() {
        return "Michelin is moving the vehicle";

    }

    @Override
    public String applyBreak() {
        return "Michelin applies break";
    }
}
