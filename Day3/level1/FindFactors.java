
import java.util.Scanner;


public class FindFactors {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user

        int maxFactor = 10;

        // Create a factors array with size maxFactor
        int[] factors = new int[maxFactor];

        int index = 0;

        for (int i = 1; i <= number; i++) {
           
            if (number % i == 0) {
                // If index reaches maxFactor, resize the factors array
                if (index == maxFactor) {
                   
                    maxFactor *= 2;

                    
                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign the factors array to the temp array
                    factors = temp;
                }

                // Add the factor to the factors array and increment the index
                factors[index] = i;
                index++;
            }
        }

        // Display the factors of the number
        System.out.print("The factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " "); // Print each factor
        }

       
    }
}
