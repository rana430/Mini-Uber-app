package CustomerCare;

public class Ticket {
    private static int idCounter = 0;
    private int id;
    private String description;
    private CommunicationChannel communicationChannel;
    private String status;

    public Ticket(String description, CommunicationChannelFactory channelFactory) {
        this.id = idCounter++;
        this.description = description;
        this.communicationChannel = channelFactory.createChannel();
        this.status = "Open";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void sendMessage(String message) {
        communicationChannel.sendMessage(message);
    }
}
