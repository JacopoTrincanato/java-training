package print_patterns;

import java.util.Scanner;

public class PrintPatterns {
    public static void main(String[] args) {

        System.out.println("Digit a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // square pattern
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // sorted square pattern
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(i);
            }

            System.out.println();
        }

        // left side triangle pattern
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // right side triangle pattern
        for (int i = 1; i <= number; i++) {

            for (int k = 1; k <= number - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // full triangle pattern
        for (int i = 1; i <= number; i++) {

            for (int k = 1; k <= number - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // reverse full triangle pattern
        for (int i = number; i >= 1; i--) {

            for (int k = number - i; k >= 1; k--) {
                System.out.print(" ");
            }

            for (int j = i * 2 - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        scanner.close();
    }
}
