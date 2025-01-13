import java.util.Scanner;
public class CountDown{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown Timer: ");
        int count = sc.nextInt();

        while (counter>0) { // loop till 0
            System.out.println(counter);
            count--; // decrements the counter
        }
        System.out.println("Launched!"); 
    }
}