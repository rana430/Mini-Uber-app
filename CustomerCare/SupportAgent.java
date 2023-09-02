package CustomerCare;

class SupportAgent implements TicketStatusObserver {
    private String name;

    public SupportAgent(String name) {
        this.name = name;
    }

    @Override
    public void update(Ticket ticket) {
        System.out.println("Support Agent " + name + " received an update for Ticket " + ticket.getId() + ": " + ticket.getStatus());
    }
}

