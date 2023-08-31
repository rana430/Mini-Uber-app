package TypesOfRides.dpproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(true){
        System.out.println("Choose an option:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        int option = scanner.nextInt();

        System.out.println("Select role: ");
        System.out.println("1. User");
        System.out.println("2. Driver");
        System.out.println("3. Admin");
        String role = scanner.next();

        if (option == 1) {
            if (role.equals("1"))
                User.login(role);
            else if (role.equals("2"))
                Driver.login(role);
            else if (role.equals("3"))
                Admin.login();
            else
                continue;
        } else if (option == 2) {
            if (role.equals("1"))
                User.createUser(role);
            else if (role.equals("2"))
                Driver.createDriver(role);
            else
                continue;
        }
    }
}
}