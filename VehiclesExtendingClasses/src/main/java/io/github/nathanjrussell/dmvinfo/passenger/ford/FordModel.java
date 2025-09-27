package io.github.nathanjrussell.dmvinfo.passenger.ford;

import io.github.nathanjrussell.dmvinfo.passenger.Makes;
import io.github.nathanjrussell.dmvinfo.passenger.PassengerVehicle;

public class FordModel extends PassengerVehicle {

    private final Models model;

    public FordModel(
            String vin,
            int manufactureYear,
            Models model
    ) {
        super(
                vin,
                manufactureYear,
                Makes.FORD
        );
        this.model = model;
    }
    public Models getModel() {
        return model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Model: ").append(model).append("\n");
        return sb.toString();
    }
}
