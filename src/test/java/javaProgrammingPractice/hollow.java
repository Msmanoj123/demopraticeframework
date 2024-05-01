package javaProgrammingPractice;

import java.util.Scanner;

public class hollow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                // Check if it is the first or last row or column or not
                if (i == 1 || i == size || j == 1 || j == size) {
                    // Print '*' for the first, last row, and first, last column
                    System.out.print("* ");
                } else {
                    // Print space for the inner part of the square
                    System.out.print("  ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
