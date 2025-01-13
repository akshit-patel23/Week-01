
import java.util.Arrays;

public class NumberCheckerExtend1 {

    // Method to find the count of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // Method to store digits of the number in an array
    public static int[] getDigitArray(int num) {
        int count = countDigits(num);
        int[] digitArray = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digitArray[i] = num % 10; // Extract digits from the number
            num = num / 10;
        }
        return digitArray;
    }

    // Method to calculate the sum of all digits
    public static int sumOfDigits(int[] digitArray) {
        int sum = 0;
        for (int digit : digitArray) {
            sum += digit;
        }
        return sum;
    }

    // Method to calculate the sum of the squares of digits
    public static int sumOfSquares(int[] digitArray) {
        int sum = 0;
        for (int digit : digitArray) {
            sum += Math.pow(digit, 2); // Square each digit and add to the sum
        }
        return sum;
    }

    // Method to check if a number is a Harshad number (divisible by the sum of its digits)
    public static boolean isHarshadNumber(int num, int[] digitArray) {
        int sum = sumOfDigits(digitArray);
        return num % sum == 0;
    }

    // Method to calculate the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digitArray) {
        int[][] frequencyArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i; // Initialize with digit values (0-9)
        }
        for (int digit : digitArray) {
            frequencyArray[digit][1]++; // Count occurrences of each digit
        }
        return frequencyArray;
    }

    public static void main(String[] args) {
        // Input number
        int num = 1729;

        // Call methods and display results
        int count = countDigits(num);
        int[] digitArray = getDigitArray(num);

        int sum = sumOfDigits(digitArray);
        int sumSquares = sumOfSquares(digitArray);
        boolean isHarshad = isHarshadNumber(num, digitArray);

        int[][] frequency = digitFrequency(digitArray);

        // Print results
        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + count);
        System.out.println("Digits array: " + Arrays.toString(digitArray));
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumSquares);
        System.out.println("Is Harshad number: " + (isHarshad ? "Yes" : "No"));
        System.out.println("Digit Frequencies:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) { // Print only digits that appear in the number
                System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
            }
        }
    }
}



