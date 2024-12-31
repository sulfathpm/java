import java.util.Scanner;

class Matrix {
    Scanner s=new Scanner(System.in);
    private int[][] matrix;
    private int rows;
    private int cols;

    // Constructor
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    // Method to read the matrix
    public void readMatrix() {
        System.out.println("Enter the elements of the " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
    }

    // Method to display the matrix
    public void displayMatrix() {
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to compute and display the transpose
    public void displayTranspose() {
        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input dimensions for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = s.nextInt();

        // Create a matrix object
        Matrix matrix = new Matrix(rows, cols);

        // Read, display, and compute transpose
        matrix.readMatrix();
        matrix.displayMatrix();
        matrix.displayTranspose();

        s.close();
    }
}
