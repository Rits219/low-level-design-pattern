package CarRentalSystem.product;

public class Vehicle {
    int vehicleId;
    VehicleType vehicleType;
    int vehicleNumber;
    double dailyRentalPrice;
    double hourlyRentalPrice;
    VehicleStatus status;

    public double getDailyRentalPrice() {
        return dailyRentalPrice;
    }

    public double getHourlyRentalPrice() {
        return hourlyRentalPrice;
    }

    public int getVehicleNumber() {
        return this.vehicleNumber;
    }

    public VehicleStatus getVehicleStatus() {
        return this.status;
    }

    public Vehicle(int vehicleId, VehicleType vehicleType, int vehicleNumber, double dailyRentalPrice, double hourlyRentalPrice, VehicleStatus vehicleStatus) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.dailyRentalPrice = dailyRentalPrice;
        this.hourlyRentalPrice = hourlyRentalPrice;
        this.status = vehicleStatus;
    }
}
