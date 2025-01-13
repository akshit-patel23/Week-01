import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number>0) { // num greater than zero are positive integers
            System.out.println("Positive");
        } else if (number <0) { // less than zero print negative integers
            System.out.println("Negative");
        } else { // else print it is zero
            System.out.println("Zero");
        }
    }
}