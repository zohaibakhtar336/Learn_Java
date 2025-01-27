class TicketBooking {
    int availableSeats = 2;

    synchronized void bookSeat(String name, int seatsToBook) {
        if (seatsToBook <= availableSeats) {
            System.out.println(name + " is booking " + seatsToBook + " seat(s).");
            availableSeats -= seatsToBook;
            System.out.println(name + " successfully booked " + seatsToBook + " seat(s).");
            System.out.println("Remaining seats: " + availableSeats);
        } else {
            System.out.println(name + " tried to book " + seatsToBook + " seat(s) but not enough seats are available.");
        }
    }
}

class Passenger extends Thread {
    TicketBooking booking;
    String name;
    int seatsToBook;

    Passenger(TicketBooking booking, String name, int seatsToBook) {
        this.booking = booking;
        this.name = name;
        this.seatsToBook = seatsToBook;
    }

    public void run() {
        booking.bookSeat(name, seatsToBook);
    }
}

public class SynchronizedTicketBookingExample {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        Passenger p1 = new Passenger(booking, "Rahul", 1);
        Passenger p2 = new Passenger(booking, "Priya", 2);

        p1.start();
        p2.start();
    }
}
