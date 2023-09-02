package CustomerCare;
import java.util.List;
import java.util.ArrayList;
class Ticket {
    private static int idCounter = 1;
    private int id;
    private String description;
    private String status;
    private List<TicketStatusObserver> observers = new ArrayList<>();

    public Ticket(String description) {
        this.id = idCounter++;
        this.description = description;
        this.status = "Open";
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public void addObserver(TicketStatusObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TicketStatusObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (TicketStatusObserver observer : observers) {
            observer.update(this);
        }
    }
}