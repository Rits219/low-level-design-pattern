package DesignPattern.NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle bikeVehicle = VehicleFactory.getVehicle("Bike");
        System.out.println(bikeVehicle.getSeatingCapacity());

        Vehicle carVehicle = VehicleFactory.getVehicle("CAR");
        System.out.println(carVehicle.getTankCapacity());
    }
}
