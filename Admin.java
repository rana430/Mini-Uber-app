import java.util.Scanner;
public class Admin {

    private static final String USER_NAME = "admin";
    private static final String PASSWORD ="admin_pass";
    public String getUserName() {
        return USER_NAME;
    }
    public static boolean loginSuccessfully() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User name :");
        String UName = scanner.next();
        System.out.println("Password :");
        String pass = scanner.next();
        if (UName.equals(USER_NAME) && pass.equals(PASSWORD)) {
            System.out.println("WELCOME  Admin");
            return true;
        }
        return false;
    }
}
