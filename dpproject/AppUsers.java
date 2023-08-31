package TypesOfRides.dpproject;

public class AppUsers {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String Password;
    public AppUsers(String fName , String lName , String phoneNum , String pass)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNumber = phoneNum;
        this.Password = pass;
    }
    public String getUserName() {return firstName + lastName;}
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
