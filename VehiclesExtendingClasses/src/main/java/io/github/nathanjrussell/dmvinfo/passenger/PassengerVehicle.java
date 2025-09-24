package io.github.nathanjrussell.dmvinfo.passenger;

import io.github.nathanjrussell.dmvinfo.Vehicle;
import io.github.nathanjrussell.dmvinfo.VehicleTypes;

public abstract class PassengerVehicle extends Vehicle {
    private final Makes make;

    public PassengerVehicle(
            String vin,
            int manufactureYear,
            Makes make
    ) {
        super(
                vin,
                manufactureYear,
                VehicleTypes.PASSENGER
        );
        this.make = make;
    }
}
