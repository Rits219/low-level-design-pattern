package DesignPattern.NullObjectDesignPattern;

import java.util.Objects;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if (Objects.equals(vehicleType, "CAR")) {
            return new CarVehicle();
        }
        return new NullVehicle();
    }
}
