import java.util.*;

public class RailwayTicketBooking {
    public static void main(String[] args) {
        LinkedList<String> passengerList = new LinkedList<>();
        passengerList.add("Faizan");
        passengerList.add("Meera");
        passengerList.add("Nikhil");
        passengerList.add("Sana");

        ListIterator<String> listIterator = passengerList.listIterator();

        System.out.println("Forward check of passenger list:");
        while (listIterator.hasNext()) {
            String passenger = listIterator.next();
            System.out.println("Passenger: " + passenger);

            if (passenger.equals("Meera")) {
                listIterator.set("Meera (Upgraded to AC Class)");
            }
        }

        System.out.println("\nBackward check for seat adjustments:");
        while (listIterator.hasPrevious()) {
            String passenger = listIterator.previous();
            System.out.println("Checking: " + passenger);

            if (passenger.equals("Sana")) {
                listIterator.add("Rohit (Tatkal Booking)");
                System.out.println("Added Tatkal passenger after Sana.");
            }
        }

        System.out.println("\nFinal Passenger List: " + passengerList);
    }
}
