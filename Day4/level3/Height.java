import java.util.Scanner;

public class Height {

    // Calculates the sum of heights
    public static int sumOfHeight(int[] height) {
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += height[i];
        }
        return sum;
    }

    // Calculates the mean height using the formula: mean = sum / count
    public static double meanHeight(int sum, int[] height) {
        return sum / (double) height.length;
    }

    // Finds the shortest height by comparing all heights
    public static int shortestHeight(int[] height) {
        int shortestHeight = Integer.MAX_VALUE;
        for (int i = 0; i < height.length; i++) {
            if (height[i] < shortestHeight) {
                shortestHeight = height[i];
            }
        }
        return shortestHeight;
    }

    // Finds the tallest height by comparing all heights
    public static int tallestHeight(int[] height) {
        int tallestHeight = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
            }
        }
        return tallestHeight;
    }

    public static void main(String args[]) {
        int[] height = new int[11];
        Scanner input = new Scanner(System.in);

        // Input heights of players
        for (int i = 0; i < height.length; i++) {
            System.out.println("Enter the height of player " + (i + 1) + ":");
            height[i] = input.nextInt();
        }

        int sum = sumOfHeight(height);
        int shortestHeight = shortestHeight(height);
        int tallestHeight = tallestHeight(height);
        double meanHeight = meanHeight(sum, height);

        System.out.println("Sum of heights: " + sum +
                "\nMean Height: " + meanHeight +
                "\nTallest Height: " + tallestHeight +
                "\nShortest Height: " + shortestHeight);
    }
}