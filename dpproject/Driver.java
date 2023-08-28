package dpproject;

public class Driver extends APPUser {
    private String drivingLicenseNumber;
    private String carLicenseNumber;

    public Driver(String firstName, String lastName, String phoneNumber, String drivingLicenseNumber, String carLicenseNumber, String Password) {
        super(firstName, lastName, phoneNumber, Password);
        this.drivingLicenseNumber = drivingLicenseNumber;
        this.carLicenseNumber = carLicenseNumber;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }
}
