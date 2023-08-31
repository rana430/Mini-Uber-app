package TypesOfRides.src;

import java.util.Scanner;

public class DriverCreator {
    private static Scanner scanner = new Scanner(System.in);
    private static UsersFile driverFile = UsersFile.getUsersFile();
    public static void createDriver(String role) {
        Types t = new Types();
        System.out.println("Enter First name:");
        String firstName = scanner.next();
        System.out.println("Enter Last name:");
        String lastName = scanner.next();
        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.next();
        System.out.println("Enter Password:");
        String password = scanner.next();
        System.out.println("Enter Driving License Number:");
        String drivingLicenseNumber = scanner.next();
        System.out.println("Enter Car License Number:");
        String carLicenseNumber = scanner.next();
        System.out.println("Enter Car Type: 1)Normal 2)Premium 3)Bus 4)Motorbike");
        String type = scanner.next();

        driverFile.write(role + "\t" + firstName + "\t" + lastName + "\t" + phoneNumber + "\t" + password + "\t" + drivingLicenseNumber + "\t" + carLicenseNumber + "\t" + type);
        System.out.println("WELCOME  "+ firstName + lastName);

        Driver build = new DriverBuilder().setFirstName(firstName)
                .setLastName(lastName)
                .setPhoneNumber(phoneNumber)
                .setPassword(password)
                .setDrivingLicenseNumber(drivingLicenseNumber)
                .setCarLicenseNumber(carLicenseNumber)
                .setVeichleType(t, type)
                .build();
        //build.veichleType.description(10);
    }
    public static void login(String role) {
        Types t = new Types();
        System.out.println("User name :");
        String UName = scanner.next();

        System.out.println("Password :");
        String pass = scanner.next();

        String[] driverData =driverFile.read( role , UName , pass);
        if (driverData != null) {
            System.out.println("WELCOME  "+ UName);
            Driver driver = new DriverBuilder().setFirstName(driverData[1])
                    .setLastName(driverData[2])
                    .setPhoneNumber(driverData[4])
                    .setPassword(driverData[3])
                    .setDrivingLicenseNumber(driverData[5])
                    .setCarLicenseNumber(driverData[6])
                    .setVeichleType(t, driverData[7])
                    .build();
        }
        else{
            System.out.println("Enter Valid Data!");
            login("2");
        }
    }
}
