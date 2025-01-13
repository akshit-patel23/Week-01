import java.util.Scanner;

public class SumStop { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0) 
				break; // Stop when 0 or negative is entered
			
            total += input; // Add input to total
        }

        System.out.println("Total sum: " + total);
    }
}
