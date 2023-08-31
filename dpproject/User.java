package TypesOfRides.dpproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class User extends AppUsers{
    static UsersFile userFile = UsersFile.getUsersFile();
    static Scanner scanner = new Scanner(System.in);

    public User(String firstName, String lastName, String phoneNumber , String Password) {
        super(firstName , lastName , phoneNumber , Password);
    }
    public static void createUser(String role) {
        System.out.println("Enter First name:");
        String firstName = scanner.next();
        System.out.println("Enter Last name:");
        String lastName = scanner.next();
        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.next();
        System.out.println("Enter Password:");
        String password = scanner.next();
        userFile.write(role+"\t"+firstName + "\t" + lastName +"\t" + phoneNumber +"\t" + password);
        System.out.print("WELCOME  "+ firstName + lastName);
        User user = new User(firstName, lastName, phoneNumber, password);
        user.userMenu();
    }
    public static User login(String role) {
        System.out.println("User name :");
        String UName = scanner.next();
        System.out.println("Password :");
        String pass = scanner.next();
        String[] userData = userFile.read( role , UName , pass);
        System.out.print("WELCOME  "+ UName);
        return new User(userData[1], userData[2] , userData[3] , userData[4]);
    }
    public void userMenu()
    {
        System.out.println("1) Request Ride ");
        System.out.println("2) View Approval");
        System.out.println("3) Rate Ride");
        int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter pickup location");
                String pickupL = scanner.next();
                System.out.println("Enter destination");
                String dest = scanner.next();
                RideRequest rideRequest = new RideRequest(pickupL, dest , this.getUserName());
                try{
                    FileWriter file = new FileWriter("RideRequests.txt", true);
                    BufferedWriter RFileWriter = new BufferedWriter(file);
                    RFileWriter.write(RideRequest.requestCounter+"\t"+pickupL+"\t"+dest + "\t" +this.getUserName()+ "\n");
                    RFileWriter.close();
                }catch (IOException e) {
                    System.out.println("Error writing user data to file.");
                }
            case 2:
            case 3:
        }
    }
}
