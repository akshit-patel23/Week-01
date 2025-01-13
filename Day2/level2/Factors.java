//A program to find the factors of a number taken as user input.
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
		

          Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");

        for (int i = 1; i < number; i++) {
            if (number % i == 0) 
			{ 
                System.out.print(i + " ");            
			}
        }
    }
}



