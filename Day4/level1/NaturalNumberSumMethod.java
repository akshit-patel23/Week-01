//Import Scanner Class For taking user input
import java.util.Scanner;

class NaturalNumberSumMethod {
	
	static int sum(int number){
		int sum = 0 ;
		for(int i = 1; i <= number ; i++ ){
			sum += i ; 
		}
		return sum;
	}
	
    public static void main(String[] args) {
        
        // Declare a variable to store the input number
        int number;
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        System.out.println("Sum: "+sum(number));
    }
}
