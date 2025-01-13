import java.util.ArrayList;
import java.util.List;

public class NumberCheckerMethodExtends4 {

    // Method to find factors of a number
    public static int[] findFactors(int num) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList.stream().mapToInt(i -> i).toArray();
    }

    // Method to find the greatest factor of a number
    public static int greatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static long productOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            if (factor != num) { // Proper divisors exclude the number itself
                sum += factor;
            }
        }
        return sum == num;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            if (factor != num) {
                sum += factor;
            }
        }
        return sum > num;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            if (factor != num) {
                sum += factor;
            }
        }
        return sum < num;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Test number
        int num = 28;

        // Factors and related calculations
        int[] factors = findFactors(num);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));

        // Number classifications
        System.out.println("Is Perfect Number: " + (isPerfectNumber(num) ? "Yes" : "No"));
        System.out.println("Is Abundant Number: " + (isAbundantNumber(num) ? "Yes" : "No"));
        System.out.println("Is Deficient Number: " + (isDeficientNumber(num) ? "Yes" : "No"));
        System.out.println("Is Strong Number: " + (isStrongNumber(num) ? "Yes" : "No"));
    }
}
