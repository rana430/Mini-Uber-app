package TypesOfRides.dpproject;

import java.util.Scanner;
public class Driver extends AppUsers{

    private String drivingLicenseNumber;
    private String carLicenseNumber;
    private Types veichleType;
    static UsersFile driverFile = UsersFile.getUsersFile();
    public Driver(String firstName, String lastName, String phoneNumber, String drivingLicenseNumber, String carLicenseNumber, String Password , Types t) {
        super(firstName , lastName , Password , phoneNumber);
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

    public static void createDriver(String role) {
        Scanner scanner = new Scanner(System.in);
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

        driverFile.write(role + "\t" + firstName + "\t" + lastName + "\t" + password + "\t" + phoneNumber + "\t" + drivingLicenseNumber + "\t" + carLicenseNumber + "\t" + type);
        System.out.println("WELCOME  "+ firstName + lastName);

        Driver build = new DriverBuilder().setFirstName(firstName)
                .setLastName(lastName)
                .setPhoneNumber(phoneNumber)
                .setPassword(password)
                .setDrivingLicenseNumber(drivingLicenseNumber)
                .setCarLicenseNumber(carLicenseNumber)
                .setVeichleType(t, type)
                .build();
        build.veichleType.description(10);
    }
    public static Driver login(String role) {
        Scanner scanner = new Scanner(System.in);
        Types t = new Types();
        System.out.println("User name :");
        String UName = scanner.next();

        System.out.println("Password :");
        String pass = scanner.next();

        String[] driverData =driverFile.read( role , UName , pass);
        System.out.print("WELCOME  "+ UName);
        return new DriverBuilder().setFirstName(driverData[1])
                .setLastName(driverData[2])
                .setPhoneNumber(driverData[4])
                .setPassword(driverData[3])
                .setDrivingLicenseNumber(driverData[5])
                .setCarLicenseNumber(driverData[6])
                .setVeichleType(t, driverData[7])
                .build();
    }
    /*switch (type)
        {
            case "1":
                 veichleType.setTypes(new NormalDescprition());
                 break;
            case "2":
                veichleType.setTypes(new PremiumDescription());
                break;
            case "3":
                veichleType.setTypes(new BusDescription());
                break;
            case "4":
                veichleType.setTypes(new MotorbikeDescription());
                break;
            default:
                createDriver("2");
                break;
        }
        driverFile.write(role + "\t" + firstName + "\t" + lastName + "\t" + password + "\t" + phoneNumber + "\t" + drivingLicenseNumber + "\t" + carLicenseNumber + "\t" + type);
        System.out.print("WELCOME  "+ firstName + lastName);

        Driver build = new DriverBuilder().setFirstName(firstName)
                .setLastName(lastName)
                .setPhoneNumber(phoneNumber)
                .setPassword(password)
                .setDrivingLicenseNumber(drivingLicenseNumber)
                .setCarLicenseNumber(carLicenseNumber)
                .build();
        veichleType.description(10);
        return build;*/
}
