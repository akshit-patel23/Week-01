// Import Scanner class for taking the user input in the program.
import java.util.Scanner;

// Create SmallestAndLargestIn3 class to check and display the numbers
public class SmallestAndLargestIn3{
	
	//Create function to find smallest and largest among three number.
public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		//Create array to return.
		int arr[] = new int[2];
		//Variable to store largest and smallest
		int largest=0, smallest=0;
		
		//Checking conditions.
		if(number1 <= number2 && number1 <= number3){
			smallest = number1;
		}
		else if(number2 < number1 && number2 < number3){
			smallest = number2;
		}
		else{
			smallest = number3;
		}
			
		
		if(number1 >= number2 && number1 >= number3){
			largest = number1;
		}
		else if(number2 > number1 && number2 > number3){
			largest = number2;
		}
		else{
			largest = number3;
		}
			
		//Assigning values
		arr[0] = smallest;
		arr[1] = largest;
		
		//Return array 
		return arr;
	
}
	
	
    public static void main(String args[]){
        // Create a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);
		
        // Take user input to enter the numbers
        System.out.println("Enter the number1: ");
        int number1 = sc.nextInt();
		
		// Take user input to enter the numbers
        System.out.println("Enter the number2: ");
        int number2 = sc.nextInt();
		
		// Take user input to enter the numbers
        System.out.println("Enter the number3: ");
        int number3 = sc.nextInt();
		
		//Create array for largest and smallest number.
		int arr[] = new int[2];
		
		//Calling the function findSmallestAndLargest.
		arr = findSmallestAndLargest(number1,number2,number3);
		
		//Print the result.
		System.out.println("The smallest number is: "+ arr[0] +" and the largest is: "+ arr[1] );
		
		
		
		

	}
}	