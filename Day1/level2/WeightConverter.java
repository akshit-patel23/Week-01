import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Conversion factor: 1 pound = 2.2 kilograms
        double weightInKilograms = weightInPounds / 2.2;

        
        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f.%n", 
                          weightInPounds, weightInKilograms);

        
        input.close();
    }
}
