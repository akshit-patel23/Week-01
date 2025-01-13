//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class WindChill for calculating the wind chill using wind speed and temperature.
public class WindChill{
	
	public static double calculateWindChill(double temperature, double windSpeed){
		
	return (35.74 + (0.6215 *temperature) + ((0.4275*temperature - 35.75) * (Math.pow(windSpeed,0.16))));
			
	}
	
	public static void main(String args[]){
		
		//Create object of scanner class sc for taking input.
		Scanner sc = new Scanner(System.in);
		
		//Create the variable temperature and windSpeed for input.
		System.out.println("Enter the temperature: ");
		double temperature = sc.nextDouble();
		
		System.out.println("Enter the wind speed: ");
		double windSpeed = sc.nextDouble();
		
		//Call function
		double result= calculateWindChill(temperature,windSpeed);
		
		//Print the wind chill result
		System.out.println(" The wind chill temperature "+ result);
		
		
	}
}