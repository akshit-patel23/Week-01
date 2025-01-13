import java.util.Arrays;

public class NumberCheckerMethodExtends2 {

    // Method to find the count of digits in the number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] getDigitArray(int num) {
        int count = countDigits(num);
        int[] digitArray = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digitArray[i] = num % 10;
            num /= 10;
        }
        return digitArray;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digitArray) {
        int[] reversedArray = new int[digitArray.length];
        for (int i = 0; i < digitArray.length; i++) {
            reversedArray[i] = digitArray[digitArray.length - 1 - i];
        }
        return reversedArray;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome using its digits
    public static boolean isPalindrome(int[] digitArray) {
        int[] reversedArray = reverseArray(digitArray);
        return compareArrays(digitArray, reversedArray);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digitArray) {
        for (int digit : digitArray) {
            if (digit == 0) {
                return true; // A non-zero digit is present
            }
        }
        return false; // No zero found in the array
    }

    public static void main(String[] args) {
        // Input number
        int num = 12321;

        // Get the digits array
        int[] digitArray = getDigitArray(num);

        // Reverse the digits array
        int[] reversedArray = reverseArray(digitArray);

        // Check if the number is a palindrome
        boolean palindrome = isPalindrome(digitArray);

        // Check if the number is a duck number
        boolean duckNumber = isDuckNumber(digitArray);

        // Display results
        System.out.println("Number: " + num);
        System.out.println("Digits Array: " + Arrays.toString(digitArray));
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
        System.out.println("Is Palindrome: " + (palindrome ? "Yes" : "No"));
        System.out.println("Is Duck Number: " + (duckNumber ? "Yes" : "No"));
    }
}