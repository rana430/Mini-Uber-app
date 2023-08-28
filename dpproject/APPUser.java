package dpproject;
public class APPUser {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String Password;

    public APPUser(String firstName, String lastName, String phoneNumber , String Password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.Password = Password;
    }

    /*public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }*/
    public String getUserName()
    {
        return firstName + lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
