//		Create a program to check if a number is an Abundant Number.

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
		
         Scanner scanner = new Scanner(System.in);

        //Taking input
        System.out.print("Enter a number: ");
        int number= scanner.nextInt();

        int sumOfDivisors = 0; 
		
        
        for (int i = 1; i < ((number/2)+1); i++) {
            if (number% i == 0) {  // Checking if 'i' is a divisor
                sumOfDivisors += i;    // Adding "i' to the sum
            }
        }

        // Checking for abundant number
        if (sumOfDivisors > number) {
            System.out.println(number+ " is an Abundant number.");
        } else {
            System.out.println(number+ " is not an Abundant number.");
        }
    }
}



