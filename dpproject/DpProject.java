package dpproject;
import java.util.Scanner;
public class DpProject {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Hello to Mini Uber App!");
        System.out.println("Choose : \n 1)login \t 2)register");
        int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
                UsersFile.Login();
                break;
            case 2: 
                UsersFile.Register();
                break;
        }
    } 
}
