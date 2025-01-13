// importing the Scanner class for read user input 
import java.util.Scanner;

//Create class SimpleInterestMethod for calculation the simple interest 

public class SimpleInterestMethod {
	//Function for calculating the simpleInterest
		private double simpleInterestMethod(double principle , double rate , double time ){
			return principle * time * rate / 100;
		}
	
		public static void main(String args[]){
		// Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user inputs for Principal, Rate, and Time
        System.out.println("Enter the Principal amount:");
        double principal = input.nextDouble();

        System.out.println("Enter the Rate of Interest (in percentage):");
        double rate = input.nextDouble();

        System.out.println("Enter the Time (in years):");
        double time = input.nextDouble();
		
		//Initiating Obj of Class simpleInterestMethod 
		SimpleInterestMethod obj = new SimpleInterestMethod();
		
		//Using obj we call the function simpleInterestMethod
		
		double simpleInterest = obj.simpleInterestMethod(principal,rate,time);
		
		// Print the results
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time + ".");
		}
	
}