
import java.util.Scanner;


public class MatrixCopy {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt(); // Read the number of rows

        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt(); // Read the number of columns

        // Create a 2D array (Matrix) with size rows x columns
        int[][] matrix = new int[rows][cols];

        
        System.out.println("Enter the elements of the " + rows + "x" + cols + " matrix:");

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt(); // Read the element
            }
        }

        // Create a 1D array of size rows * columns
        int[] array = new int[rows * cols];

        int index = 0;
		
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                array[index] = matrix[i][j];
                index++; // Increment the index for the 1D array
            }
        }

        System.out.println("The 2D matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " "); // Print each element in the matrix
            }
            System.out.println();
        }
 
        System.out.print("The 1D array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); 
        }

        
    }
}
