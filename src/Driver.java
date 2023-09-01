import java.util.Scanner;
public class Driver{

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String Password;
    private String drivingLicenseNumber;
    private String carLicenseNumber;
    private Types veichleType;
    static UsersFile driverFile = UsersFile.getUsersFile();
    public Driver(String firstName, String lastName, String phoneNumber, String drivingLicenseNumber, String carLicenseNumber, String Password , Types t) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.Password = Password;
        this.drivingLicenseNumber = drivingLicenseNumber;
        this.carLicenseNumber = carLicenseNumber;
        this.veichleType = t;
    }
    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }
    public String getUserName() {return firstName + lastName;}
}
