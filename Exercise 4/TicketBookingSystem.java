class Ticket {
    private String trainName;
    private double price;

    public Ticket(String trainName, double price) {
        this.trainName = trainName;
        this.price = price;
    }

    public void displayTicket() {
        System.out.println("Train: " + trainName + ", Price: " + price);
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("Express", 500);
        ticket.displayTicket();
    }
}
