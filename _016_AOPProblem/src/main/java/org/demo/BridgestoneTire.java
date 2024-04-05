package org.demo;

import org.springframework.stereotype.Component;

@Component
public class BridgestoneTire implements TireType{
    @Override
    public String moveVehicle() {
        return "Bridgestone is moving the vehicle";

    }

    @Override
    public String applyBreak() {
        return "Bridgestone applies break";
    }
}
