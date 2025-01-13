
import java.util.Scanner;

// Create QuotientAndRemainderMethod class to check and display the numbers
public class QuotientAndRemainderMethod{
	
//Create function to find Quotient and remainder.
public static int[] findremainderAndquotient(int number1, int number2){
		//Create array to return.
		int arr[] = new int[2];
		
		//Assigning values
		arr[0] = number1 / number2;
		arr[1] = number1 % number2;
		
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
		
		//Create array for quotient and remainder number.
		int arr[] = new int[2];
		
		//Calling the function.
		arr = findremainderAndquotient(number1,number2);
		
		//Print the result.
		System.out.println("The quotient is: "+ arr[0] +" and the remainder is: "+ arr[1] );	

	}
}	