import java.util.Scanner;

class Matrix1 {
    private int[][] a;
    private int m; // Number of rows
    private int n; // Number of columns

    // Constructor
    public Matrix1(int m, int n) {
        this.m = m;
        this.n = n;
        this.a = new int[m][n];
    }

    Scanner s = new Scanner(System.in);

    // Method to read the matrix
    public void ReadMatrx() {
        System.out.println("Enter the elements of the " + m + "x" + n + " matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
    }

    // Method to display the matrix
    public void DispMatrix() {
        System.out.println("The matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to calculate the product of two matrices
    public static Matrix1 Product(Matrix1 m1, Matrix1 m2) {
        if (m1.n != m2.m) {
            throw new IllegalArgumentException("Matrix multiplication not possible. Columns of the first matrix must equal rows of the second matrix.");
        }
        Matrix1 r = new Matrix1(m1.m, m2.n);
        for (int i = 0; i < m1.m; i++) {
            for (int j = 0; j < m2.n; j++) {
                r.a[i][j] = 0;
                for (int k = 0; k < m1.n; k++) {
                    r.a[i][j] += m1.a[i][k] * m2.a[k][j];
                }
            }
        }
        return r;
    }

    // Method to multiply each element of the matrix by a constant
    public void Product(int x) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] *= x;
            }
        }
    }
}

// Main class to test the Matrix1 class
public class Matrx {
    public static void main(String[] args) {
        // Initialize two matrices
        Matrix1 m1 = new Matrix1(2, 3); // 2x3 matrix
        Matrix1 m2 = new Matrix1(3, 4); // 3x4 matrix

        // Read matrices
        m1.ReadMatrx();
        m2.ReadMatrx();

        // Display matrices
        System.out.println("Matrix 1:");
        m1.DispMatrix();
        System.out.println("Matrix 2:");
        m2.DispMatrix();

        // Multiply matrices and display result
        try {
            Matrix1 r = Matrix1.Product(m1, m2);
            System.out.println("Product of Matrix 1 and Matrix 2:");
            r.DispMatrix();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Multiply matrix 1 with a constant and display result
        System.out.println("Matrix 1 after multiplying with a constant (2):");
        m1.Product(2);
        m1.DispMatrix();
    }
}
