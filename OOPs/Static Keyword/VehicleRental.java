public class VehicleRental {
    static int totalRentedVehicles = 0;

    String vehicleType;
    int rentalDuration;
    double rentalPricePerDay;

    public VehicleRental(String vehicleType, int rentalDuration, double rentalPricePerDay) {
        this.vehicleType = vehicleType;
        this.rentalDuration = rentalDuration;
        this.rentalPricePerDay = rentalPricePerDay;
        totalRentedVehicles++;
    }

    public double calculateRentalPrice() {
        double totalPrice = this.rentalDuration * this.rentalPricePerDay;
        return totalPrice;
    }

    public void displayRentalDetails() {
        double totalPrice = calculateRentalPrice();
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Rental Duration: " + this.rentalDuration + " days");
        System.out.println("Rental Price per Day: $" + this.rentalPricePerDay);
        System.out.println("Total Rental Price: $" + totalPrice);
    }

    public static void showTotalRentedVehicles() {
        System.out.println("Total Vehicles Rented: " + totalRentedVehicles);
    }

    public static void main(String[] args) {
        VehicleRental rental1 = new VehicleRental("Car", 7, 50.0);
        VehicleRental rental2 = new VehicleRental("Bike", 3, 20.0);
        VehicleRental rental3 = new VehicleRental("SUV", 5, 80.0);

        rental1.displayRentalDetails();
        rental2.displayRentalDetails();
        rental3.displayRentalDetails();

        VehicleRental.showTotalRentedVehicles();
    }
}
