package TypesOfRides.dpproject;

import java.util.Scanner;

public class UserFactory {
    private Scanner scanner;

    public UserFactory() {
        scanner = new Scanner(System.in);
    }

    public void registerMethod(String role) {
        switch (role) {
            case "1":
                // user.register(role);
                User.createUser(role);
            case "2":
                Driver.createDriver(role);
            default:
                throw new IllegalStateException("Unexpected value: " + role);
        }
    }

}
