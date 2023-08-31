package TypesOfRides.src;

import java.util.Scanner;
public class UserCreator {
    private static Scanner scanner = new Scanner(System.in);
    private static UsersFile userFile = UsersFile.getUsersFile();
    public static void createUser(String role) {
        System.out.println("Enter First name:");
        String firstName = scanner.next();
        System.out.println("Enter Last name:");
        String lastName = scanner.next();
        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.next();
        System.out.println("Enter Password:");
        String password = scanner.next();
        userFile.write(role+"\t"+firstName + "\t" + lastName +"\t" + password +"\t" + phoneNumber);
        System.out.println("WELCOME  "+ firstName + lastName);
        User user = new User(firstName, lastName, phoneNumber, password);
        user.userMenu();
    }
    public static void login(String role) {
        System.out.println("User name :");
        String UName = scanner.next();
        System.out.println("Password :");
        String pass = scanner.next();
        String[] userData = userFile.read( role , UName , pass);
        if (userData != null) {
            System.out.println("WELCOME  " + UName);
            User user = new User(userData[1], userData[2], userData[3], userData[4]);
            user.userMenu();
        }
        else{
            System.out.println("Enter Valid Data!");
            login("1");
        }
    }
}
