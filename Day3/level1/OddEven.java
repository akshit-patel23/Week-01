import java.util.Scanner;


public class OddEven {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check number is a natural number 
        if (number <= 0) {
           
            System.out.println("Please enter a valid natural number greater than 0.");
            return; // Exit the program
        }

        // Create arrays for odd and even numbers with size = number / 2 + 1
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        
        int evenIndex = 0;
        int oddIndex = 0;

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check for even number
            if (i % 2 == 0) {
                // Save the even number into the even array
                evenNumbers[evenIndex] = i;
                evenIndex++; // Increment the even index
            } else {
                // Save the odd number into the odd array
                oddNumbers[oddIndex] = i;
                oddIndex++; // Increment the odd index
            }
        }

        
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " "); // Print each odd number
        }

        
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " "); // Print each even number
        }

       
    }
}
