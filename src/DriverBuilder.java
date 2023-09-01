public class DriverBuilder {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
    private String drivingLicenseNumber;
    private String carLicenseNumber;
    private Types veichleType;

    public DriverBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public DriverBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public DriverBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public DriverBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public DriverBuilder setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
        return this;
    }

    public DriverBuilder setCarLicenseNumber(String carLicenseNumber) {
        this.carLicenseNumber = carLicenseNumber;
        return this;
    }
    public DriverBuilder setVeichleType( Types t , String type) {
        this.veichleType = t;
        switch (type)
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
        }
        return this;
    }

    public Driver build() {
        return new Driver(firstName , lastName , phoneNumber , password , drivingLicenseNumber , carLicenseNumber , veichleType);
    }
}
