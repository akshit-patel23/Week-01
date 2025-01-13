import java.util.Scanner;

public class SiCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        
        System.out.print("Enter the Rate of Interest (in percentage): ");
        double rate = input.nextDouble();

        
        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        // si=(p*r*t)/100
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result in a human-friendly format
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%%, and Time %.2f years.%n", 
                          simpleInterest, principal, rate, time);

        // Close the input to free resources
        input.close();
    }
}
