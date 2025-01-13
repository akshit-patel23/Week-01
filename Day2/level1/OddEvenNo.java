import java.util.Scanner;

public class OddEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
	// checks number is less than or equal to zero
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } 
		else { 
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) { // if number is divisible by 2 then it is even
                    System.out.println(i + " is an even number.");
                } 
				else { // not divisible by 2 then it is a odd number
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}