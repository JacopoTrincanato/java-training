package perfect_number;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println("Digit a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println("The number you digited is a perfect number");
        } else {
            System.out.println("The number you digited isn't a perfect number");
        }

        scanner.close();
    }
}
