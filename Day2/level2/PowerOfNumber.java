//Create a program to find the power of a number.

import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
		

        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the base number: ");
        int Number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        int result = 1;

        
        for (int i = 1; i <= power; i++) {
            result *= Number; 
        }

        
        System.out.println(Number + " raised to the power " + power + " is: " + result);
    }
}






