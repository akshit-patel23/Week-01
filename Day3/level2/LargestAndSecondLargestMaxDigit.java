// Import Scanner to read user input
import java.util.Scanner;

// Create a class to find the largest and second-largest digits from a number
public class LargestAndSecondLargest {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Define the number variable and take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize maxDigit variable to set the initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];  // Array to store digits
        int index = 0;  // Index variable to store the array position

        // Loop to extract digits from the number and store them in the array
        while (number != 0) {
            // If the index reaches maxDigit, increase the array size
            if (index == maxDigit) {
                // Increase maxDigit by 10
                maxDigit += 10;

                // Create a temporary array of the increased size
                int[] temp = new int[maxDigit];

                // Copy the elements from the current digits array to the temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);

                // Assign the temp array to the digits array
                digits = temp;
            }

            // Get the last digit of the number and add it to the array
            digits[index] = number % 10;
            number /= 10;  // Remove the last digit from the number
            index++;  // Increment the index
        }

        // Variables to store the largest and second largest digits
        int largest = -1;  // Initializing to -1 assuming non-negative digits
        int secondLargest = -1;

        // Loop through the digits array to find the largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        if (secondLargest != -1) {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }

        
    }
}
