import java.util.Random;

public class MatrixOperations {

    public static void main(String args) {
        int rows1 = 3, cols1 = 3; // Dimensions of matrix 1
        int rows2 = 3, cols2 = 3; // Dimensions of matrix 2

        // Create random matrices
        int matrix1 = createRandomMatrix(rows1, cols1);
        int matrix2 = createRandomMatrix(rows2, cols2);

        // Display matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Perform matrix operations
        int sum = addMatrices(matrix1, matrix2);
        int difference = subtractMatrices(matrix1, matrix2);
        int product = multiplyMatrices(matrix1, matrix2);

        // Display results
        System.out.println("Sum of matrices:");
        displayMatrix(sum);
        System.out.println("Difference of matrices:");
        displayMatrix(difference);
        System.out.println("Product of matrices:");
        displayMatrix(product);

        // Transpose of matrix 1
        int transpose1 = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transpose1);

        // Determinant of matrix 1 (assuming it's a 3x3 matrix)
        if (matrix1.length == 3 && matrix1[0].length == 3) {
            int determinant1 = determinant3x3(matrix1);
            System.out.println("Determinant of Matrix 1: " + determinant1);
        } else {
            System.out.println("Determinant calculation is not supported for non-3x3 matrices.");
        }

        // Inverse of matrix 1 (assuming it's a 3x3 matrix and invertible)
        if (matrix1.length == 3 && matrix1[0].length == 3 && determinant1 != 0) {
            double inverse1 = inverse3x3(matrix1);
            System.out.println("Inverse of Matrix 1:");
            displayMatrix(inverse1);
        } else {
            System.out.println("Matrix 1 is not invertible.");
        }
    }

    // Method to create a random matrix
    public static int createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Generate random numbers between 0 and 9
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int addMatrices(int matrix1, int matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sum;
    }