package mypack;

import java.util.Scanner;
import pack.Prime;

public class Matrix {
    Scanner s = new Scanner(System.in);
    int[][] a = new int[3][3]; // Fixed 3x3 matrix

    public void ReadMatrx() {
        System.out.println("Enter the elements of the 3x3 matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = s.nextInt();
            }
        }
    }

    public void DispMatrix() {
        System.out.println("The entered matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int DiagSum() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += a[i][i]; // Sum diagonal elements
        }
        return sum; // Only return the sum, no printing here
    }

    public void checkSumPrime() {
        int diagSum = DiagSum(); // Get diagonal sum
        System.out.println("Sum of diagonal elements: " + diagSum); // Print sum here
        if (Prime.checkPrime(diagSum)) {
            System.out.println("The sum of diagonal elements is a prime number.");
        } else {
            System.out.println("The sum of diagonal elements is not a prime number.");
        }
    }
}
