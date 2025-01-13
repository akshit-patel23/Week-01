
import java.util.Scanner;

// Class for various number-related checks and operations
public class NumberCheckerMethod {

    // Method to count the number of digits in a number
    public static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // Method to create an array of digits from the number
    public static int[] digitArray(int num, int count) {
        int[] digitArray = new int[count];
        for (int i = 0; i < count; i++) {
            int element = num % 10;
            digitArray[i] = element;
            num = num / 10;
        }
        return digitArray;
    }

    // Method to check if a number is a Duck Number (contains no zero except at the start)
    public static String checkDuck(int[] digitArray) {
        boolean checkDuck = true;
        for (int i : digitArray) {
            if (i == 0) {
                checkDuck = false;
                break;
            }
        }
        return checkDuck ? "Duck Number" : "Not a Duck Number";
    }

    // Method to check if a number is an Armstrong Number
    public static String checkArmstrong(int[] digitArray, int num, int count) {
        int temp = 0;
        for (int i : digitArray) {
            temp += Math.pow(i, count);
        }
        return temp == num ? "Armstrong Number" : "Not an Armstrong Number";
    }

    // Method to find the largest and second largest digits in a number
    public static String largestSecondLargest(int[] digits, int index) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return "Largest: " + largest + "\nSecond Largest: " + secondLargest;
    }

    // Method to find the smallest and second smallest digits in a number
    public static String smallestSecondSmallest(int[] digits, int index) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < index; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return "Smallest: " + smallest + "\nSecond Smallest: " + secondSmallest;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Input: Number from the user
        System.out.println("Enter the Number:");
        int num = input.nextInt();

        int count = countDigit(num); // Count digits in the number
        int[] digitArray = digitArray(num, count); // Create array of digits

        // Perform various checks and calculations
        String checkDuck = checkDuck(digitArray);
        String armstrong = checkArmstrong(digitArray, num, count);
        String largestSecondLargest = largestSecondLargest(digitArray, count);
        String smallestSecondSmallest = smallestSecondSmallest(digitArray, count);

        // Output results
        System.out.println("Number: " + num +
                "\nCount of Digits: " + count +
                "\n" + checkDuck +
                "\n" + armstrong +
                "\n" + largestSecondLargest +
                "\n" + smallestSecondSmallest);
    }
}



