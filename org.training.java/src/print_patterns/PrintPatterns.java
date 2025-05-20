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

        scanner.close();
    }
}
