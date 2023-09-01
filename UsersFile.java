import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class UsersFile {

    private UsersFile() {}
    private static UsersFile UFile = new UsersFile();
    public static UsersFile getUsersFile ()
    {
        return UFile;
    }
    public void write(String line)
    {
        try{
            FileWriter file = new FileWriter("users.txt", true);
            BufferedWriter UFileWriter = new BufferedWriter(file);
                    UFileWriter.write(line+ "\n");
                    UFileWriter.close();

        }catch (IOException e) {
            System.out.println("Error writing user data to file.");
        }
    }
    public String[] read(String type , String userName , String Pass) {
        String line;
        String[] userData = {};
        try {
            FileReader file = new FileReader("users.txt");
            BufferedReader UFileReader = new BufferedReader(file);
            while((line = UFileReader.readLine())!= null) {

                userData = line.split("\t");
                if ( userData[0].equals(type)) {
                    if ((userData[1] + userData[2]).equals(userName) && userData[4].equals(Pass)) {
                        return userData;
                    }
                }
            }
            UFileReader.close();
        } catch (IOException e) {
            System.out.println("Error writing user data to file.");
        }
        return null;
    }
}
