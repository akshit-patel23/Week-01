import java.util.Arrays;

public class NumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return Integer.toString(square).endsWith(Integer.toString(num));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        // Example numbers for testing
        int[] numbers = {2, 9, 15, 76, 25, 7, 49};

        for (int num : numbers) {
            System.out.println("Number: " + num);
            System.out.println("Is Prime: " + (isPrime(num) ? "Yes" : "No"));
            System.out.println("Is Neon: " + (isNeon(num) ? "Yes" : "No"));
            System.out.println("Is Spy: " + (isSpy(num) ? "Yes" : "No"));
            System.out.println("Is Automorphic: " + (isAutomorphic(num) ? "Yes" : "No"));
            System.out.println("Is Buzz: " + (isBuzz(num) ? "Yes" : "No"));
            System.out.println("------------------------------------");
        }
    }
}
