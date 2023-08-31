package CustomerCare;

import java.util.List;
import java.util.ArrayList;  // Import ArrayList implementation
import java.util.LinkedList;
class TicketingSystem {
    private static TicketingSystem instance;

    private List<Ticket> tickets = new ArrayList<>();
    private List<TicketStatusObserver> observers = new ArrayList<>();

    private TicketingSystem() {
        // Private constructor
    }

    public static TicketingSystem getInstance() {
        if (instance == null) {
            instance = new TicketingSystem();
        }
        return instance;
    }
    public void addObserver(TicketStatusObserver observer) {
        observers.add(observer);
    }

    public void createTicket(String description, CommunicationChannelFactory channelFactory) {
        Ticket ticket = new Ticket(description, channelFactory);
        tickets.add(ticket);
        notifyObservers(ticket);
    }

    private void notifyObservers(Ticket ticket) {
        for (TicketStatusObserver observer : observers) {
            observer.update(ticket);
        }
    }
}