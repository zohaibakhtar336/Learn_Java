public class TemperatureConversion {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = 77.0;

        double cToF = (celsius * 9 / 5) + 32;
        double fToC = (fahrenheit - 32) * 5 / 9;

        System.out.println(celsius + " Celsius is equal to " + cToF + " Fahrenheit.");
        System.out.println(fahrenheit + " Fahrenheit is equal to " + fToC + " Celsius.");
    }
}
