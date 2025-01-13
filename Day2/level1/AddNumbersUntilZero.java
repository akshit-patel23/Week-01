import java.util.Scanner;

public class AddNumbersUntilZero { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 to stop the program): ");
            double input = sc.nextDouble();

            if (input == 0) 
				break; // Exit loop when 0 is entered
			
            total += input; // Add input to total
        }

        System.out.println("Total sum: " + total);
    }
}
