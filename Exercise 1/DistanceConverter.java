public class DistanceConverter {
    public static void main(String[] args) {
        double kilometers = 10.0;
        double miles = 6.2;

        double kmToMiles = kilometers * 0.6213;
        double milesToKm = miles / 0.6213;

        System.out.println(kilometers + " kilometers is " + kmToMiles + " miles.");
        System.out.println(miles + " miles is " + milesToKm + " kilometers.");
    }
}
