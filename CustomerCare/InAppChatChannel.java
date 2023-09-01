package CustomerCare;

public class InAppChatChannel implements CommunicationChannel {
    public void sendMessage(String message) {
        System.out.println("Sending in-app chat message: " + message);
    }
}