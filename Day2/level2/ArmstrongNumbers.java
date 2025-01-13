import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        
        int sumOfCubes = 0;  
        int originalNumber = inputNumber; 
		
		int countNumber = inputNumber; 
		int power=0;
		
		
		while(countNumber!=0){ //for counting power
			countNumber/=10;
		power++;}
			
			
        
        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10;  
            sumOfCubes += Math.pow(lastDigit,power); 
            originalNumber /= 10;                 // Removing the last digit 
        }

        // Checking for the armstrong
        if (sumOfCubes == inputNumber) {
            System.out.println(inputNumber + " is an Armstrong number.");
        } else {
            System.out.println(inputNumber + " is not an Armstrong number.");
        }
    }
}
