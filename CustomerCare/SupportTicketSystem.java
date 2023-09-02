package CustomerCare;
import java.util.List;
import java.util.ArrayList;



public class SupportTicketSystem {
    private static SupportTicketSystem instance;
    private List<Ticket> tickets = new ArrayList<>();

    private SupportTicketSystem() {
        // Private constructor
    }

    public static SupportTicketSystem getInstance() {
        if (instance == null) {
            instance = new SupportTicketSystem();
        }
        return instance;
    }

    public void createTicket(String description) {
        Ticket ticket = new Ticket(description);
        tickets.add(ticket);
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }
}
