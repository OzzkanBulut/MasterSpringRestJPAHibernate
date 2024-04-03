package org.demo;

public class MichelinTire implements TireType{
    private String name;
    @Override
    public String rotate() {
        return "Michelinne is rotating";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
