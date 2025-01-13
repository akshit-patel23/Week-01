import java.util.Scanner;
public class CountDownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();
	
        for (int i = counter; i > 0; i--) {
            System.out.println(i); // printing countdown 
        }
        System.out.println("Launched!"); 
    }
}