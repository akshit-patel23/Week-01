import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter the height of friend " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; // Update index of youngest
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; // Update index of tallest
            }
        }

        String[] friends = {"Amar", "Akbar", "Anthony"}; // Array to map names to indices

        System.out.println("\nThe youngest friend is: " + friends[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex]);
    }
}
