import java.io.*;
import java.util.Scanner;

public class User{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String Password;
    static UsersFile userFile = UsersFile.getUsersFile();
    static Scanner scanner = new Scanner(System.in);

    public String getUserName() {return firstName + lastName;}
    public User(String firstName, String lastName, String phoneNumber , String Password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.Password = Password;
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
                System.out.println("Choose pickup location\n");
                System.out.println("1- Cairo\n");
                System.out.println("2- Giza\n");
                System.out.println("3- Alex\n");
                System.out.println("4- Fayoum\n");
                System.out.println("5- 6-October\n");
                int pickupL = Integer.parseInt(scanner.next());
                int lineCount = 1;
                System.out.println("Choose destination");
                System.out.println("1- Cairo\n");
                System.out.println("2- Giza\n");
                System.out.println("3- Alex\n");
                System.out.println("4- Fayoum\n");
                System.out.println("5- 6-October\n");
                int dest = Integer.parseInt(scanner.next());
                 int payChoice = scanner.nextInt();
                  switch (payChoice)
                  {
                      case 1:
                          System.out.println(" pls enter Card Number : ");
                          String cn = scanner.next();
                          System.out.println(" pls enter CVV : ");
                          String cvv = scanner.next();
                          System.out.println("pls enter expiration date : ");
                          String exp = scanner.next();
                          CreditCard c = new CreditCard(cn,cvv,exp);
                          System.out.println(c.processPayment(50,"EGP"));
                      case 2:
                          Cash cash = new Cash();
                          System.out.println(cash.processPayment(50,"EGP"));
                  }
                RideRequest rideRequest = new RideRequest(pickupL, dest , this.getUserName());

                try{
                    FileWriter file = new FileWriter("RideRequests.txt", true);
                    BufferedWriter RFileWriter = new BufferedWriter(file);
                    FileReader fileR = new FileReader("RideRequests.txt");
                    BufferedReader RFileReader = new BufferedReader(fileR);
                    while ((RFileReader.readLine()) != null) lineCount++;
                    RFileWriter.write(lineCount+"\t"+pickupL+"\t"+dest + "\t" +this.getUserName()+ "\n");
                    RFileWriter.close();
                }catch (IOException e) {
                    System.out.println("Error writing user data to file.");
                }
            case 2:
            case 3:
        }
    }
}
