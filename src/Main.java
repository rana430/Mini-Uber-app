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
                UserCreator.login(role);
            else if (role.equals("2"))
                DriverCreator.login(role);
            else if (role.equals("3") && Admin.loginSuccessfully()){
                    new Admin();
            }
            else
            {
                System.out.println("Invalid Data!");
                continue;
            }

        } else if (option == 2) {
            if (role.equals("1"))
                UserCreator.createUser(role);
            else if (role.equals("2"))
                DriverCreator.createDriver(role);
            else
                continue;
        }
    }
}
}