package javaProgrammingPractice;

public class diamond {

    public static void main(String[] args) {
//         *
//       * * *
//     * * * * *
//       * * *
//         *

        int spaces = 7 / 2;

        for (int i = 1; i <= 7; i += 2) {

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();

            // Decrease the number of spaces for the next iteration
            spaces--;
        }

        spaces = 1;

        for (int i = 7 - 2; i >= 1; i -= 2) {
            // Print leading spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();

            // Increase the number of spaces for the next iteration
            spaces++;
        }
    }
}
