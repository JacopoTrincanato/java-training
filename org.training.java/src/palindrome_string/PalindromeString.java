package palindrome_string;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a string:");
        String userString = scanner.nextLine();
        String originalString = userString;

        String reverseString = "";

        for (int i = userString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + userString.charAt(i);
        }

        System.out.println(reverseString);

        if (originalString.equals(reverseString)) {
            System.out.println(originalString + " Is a palindrome string");
        } else {
            System.out.println(originalString + " Isn't a palindrome string");
        }

        scanner.close();
    }
}
