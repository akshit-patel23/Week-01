import java.util.Scanner;
public class SumNaturalUsingFor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n > 0) {
            int sum = n * (n + 1) / 2; // sum of n natural numbers
            int Loopsum = 0;
	for (int i = 1; i <= n; i++) { 
                Loopsum +=i;
            }

            System.out.println("Sum using formula: " + sum);
            System.out.println("Sum using loop: " + Loopsum);
        } else
       	{
            System.out.println("Not a natural number");
        }	
    }
}