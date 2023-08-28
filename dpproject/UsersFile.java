package dpproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UsersFile {
    public static void Register() 
    {
        try{
        FileWriter file = new FileWriter("users.txt", true);
        BufferedWriter UFileWriter = new BufferedWriter(file);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are You a (Enter the number):\n 1) User \n 2) Driver \n");
        int choice = scanner.nextInt();
        System.out.println("Enter First name :");
        String fName = scanner.next();
        System.out.println("Enter Last name :");
        String lName = scanner.next();
        System.out.println("Enter Phone Number :");
        String phoneNum = scanner.next();
        System.out.println("Enter Pasword :");
        String pass = scanner.next();
        switch(choice)
        {
            case 1:
                
                UFileWriter.write("1\t"+fName + "\t" + lName +"\t" + pass +"\t" + phoneNum + "\n");
                UFileWriter.close();
                APPUser user = new APPUser(fName , lName , phoneNum , pass);
                System.out.print("WELCOME  "+ user.getUserName());
                break;
            case 2:
                System.out.println("Enter Driving License Number :");
                String dLicenseNum = scanner.next();
                System.out.println("Enter Car License Number :");
                String cLicenseNum = scanner.next();
                UFileWriter.write("2\t"+ fName + "\t" + lName +"\t" +pass +"\t" + phoneNum + "\t" + dLicenseNum +"\t" + cLicenseNum +"\n");
                UFileWriter.close();  
                Driver driver = new Driver(fName , lName , phoneNum , dLicenseNum , cLicenseNum , pass);
                System.out.print("WELCOME  "+ driver.getUserName());
                break;
        }
        }catch (IOException e) {
            System.out.println("Error writing user data to file.");
        } 
    }
    public static void Login() 
    {
        try{
        FileReader file = new FileReader("users.txt");
        BufferedReader UFileReader = new BufferedReader(file);
        Scanner scanner = new Scanner(System.in);
        String line;
        boolean found = false;
        String[] userData = {};
        System.out.println("Are You a (Enter the number):\n 1) User \n 2) Driver \n 3) Admin");
        int choice = scanner.nextInt();
        System.out.println("User name :");
        String uName = scanner.next();
        
        System.out.println("Pasword :");
        String pass = scanner.next();
        
        while ((line = UFileReader.readLine()) != null)
        {
            userData = line.split("\t");
            if (userData[0].equals(String.valueOf(choice)))
            {
                if ((userData[1]+userData[2]).equals(uName) && userData[3].equals(pass))
                {
                    found = true;
                    break;
                }
            }
        }
        UFileReader.close();
        if(found == false)
        {
             System.out.println("Invalid Data !");
        }
        else
        {
        switch(choice)
        {
            case 1 :
                APPUser user = new APPUser(userData[1], userData[2], userData[3], userData[4]);
                System.out.println("WeLCOME User "+ user.getUserName());
                break;
            case 2 :
                Driver driver = new Driver(userData[1], userData[2], userData[3], userData[4],userData[5], userData[6]);
                System.out.println("WeLCOME Driver "+ driver.getUserName());
                break;
            case 3:
                Admin admin = new Admin();
                System.out.println("WeLCOME Admin");
                break;
        }
        }
        }catch (IOException e) {
            System.out.println("Error writing user data to file.");
        } 
        
    }
}

