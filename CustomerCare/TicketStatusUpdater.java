package CustomerCare;

public class TicketStatusUpdater {
    public void update(Ticket ticket) {
        System.out.println("Ticket " + ticket.getId() + " status changed to " + ticket.getStatus());
    }
}
