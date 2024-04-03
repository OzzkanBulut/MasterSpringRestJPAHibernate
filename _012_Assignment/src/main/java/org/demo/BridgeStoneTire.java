package org.demo;

public class BridgeStoneTire implements TireType{
    private String name;
    @Override
    public String rotate() {
        return "Bridge Stone is rotating";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
