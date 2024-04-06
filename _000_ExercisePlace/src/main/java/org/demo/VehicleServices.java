package org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    private final TyreType tyreType;
    @Autowired
    public VehicleServices(@Qualifier("ferrariTyre") TyreType tyreType) {
        this.tyreType = tyreType;
    }


    @LogAspect
    public String moveVehicle(){
        return tyreType.moveVehicle();
    }
    @BeforeAspectI
    public void isBefore(){
        System.out.println("Some stupid method to check aspect working");
    }
}
