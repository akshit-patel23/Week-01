import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1 of the park in meters: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 of the park in meters: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 of the park in meters: ");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;  // Perimeter of the park in meters
        double totalDistanceInMeters = 5000;      // 5 km = 5000 meters
        int rounds = (int)Math.ceil(totalDistanceInMeters / perimeter); // Calculating rounds

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

        input.close();
    }
}