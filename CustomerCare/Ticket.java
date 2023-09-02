package CustomerCare;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
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

    private void saveTicketToFile(Ticket ticket) {
        try (FileWriter file = new FileWriter(ticket, true);
             BufferedWriter RFileWriter = new BufferedWriter(file)) {

            RFileWriter.write(ticket.getId() + "\t" + ticket.getDescription() + "\t" + ticket.getStatus() + "\n");
        } catch (IOException e) {
            System.out.println("Error writing ticket data to file.");
        }
    }
}