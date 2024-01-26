package OrderManagementSystem;

public class Address {
    private int addressId;
    private String city;
    private int pincode;

    public Address(int addressId, String city, int pincode) {
        this.addressId = addressId;
        this.city = city;
        this.pincode = pincode;
    }
}
