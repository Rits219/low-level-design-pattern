package CarRentalSystem;

public class Location {
    int locationId;
    String city;
    String address;
    String state;
    int pinCode;

    public Location(int locationId, String city, String address, String state, int pinCode) {
        this.locationId = locationId;
        this.city = city;
        this.address = address;
        this.state = state;
        this.pinCode = pinCode;
    }
}
