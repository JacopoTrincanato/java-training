package palindrome_number;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number:");
        int number = scanner.nextInt();
        int originalNumber = number;

        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number = number / 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println(originalNumber + " Is palindrome");
        } else {
            System.out.println(originalNumber + " Is not palindrome");
        }

        scanner.close();
    }
}
