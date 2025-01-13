// Create a class AthleteRunFunction to calculate the number of rounds the athlete must complete
// importing Scanner class for taking input
import java.util.Scanner;

public class AthleteRunFunction {
	
	double athleteRun(double distanceToRun ,double perimeter){
		return  distanceToRun / perimeter ; 
	}

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user inputs for the sides of the triangular park
        System.out.println("Enter the length of the first side of the triangular park (in meters):");
        double side1 = input.nextDouble();

        System.out.println("Enter the length of the second side of the triangular park (in meters):");
        double side2 = input.nextDouble();

        System.out.println("Enter the length of the third side of the triangular park (in meters):");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters
        double distanceToRun = 5 * 1000;

		//Initiating Obj of Class simpleInterestMethod 
		AthleteRunFunction obj = new AthleteRunFunction();
		
		//Using obj we call the function simpleInterestMethod
		
		
        // Calculate the number of rounds the athlete needs to complete
        double rounds = obj.athleteRun(distanceToRun,perimeter);

        // Print the result, rounding up the number of rounds if necessary
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");

    }
}
