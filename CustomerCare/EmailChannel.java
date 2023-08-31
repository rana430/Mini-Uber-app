package CustomerCare;

public class EmailChannel implements CommunicationChannel {
    public void sendMessage(String message) {
        System.out.println("Sending email message: " + message);
    }
}