// a program to count the number of digits in an integer.

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
	
         Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        int count = 0;

        int numberToProcess = number;

        while (numberToProcess != 0) {
            numberToProcess /= 10; // Removing the last digit
            count++;          // Incrementing the counter
        }

        // result
        System.out.println("The number " + number + " having " + count + " digits.");
    }
}
