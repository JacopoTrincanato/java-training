package reverse_numbers;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digit a number:");
        int userNumber = scanner.nextInt();

        // using algorithm
        int reverseNumber = 0;
        while (userNumber != 0) {
            reverseNumber = reverseNumber * 10 + userNumber % 10;
            userNumber = userNumber / 10;
        }

        System.out.println("Reverse number is... " + reverseNumber);

        // using StringBuff class
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(userNumber));
        StringBuffer reverse = stringBuffer.reverse();

        System.out.println("Reverse number is... " + reverse);

        // use StringBuilder method
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(userNumber);
        stringBuilder.reverse();

        System.out.println("Reverse number is... " + reverseNumber);
        scanner.close();
    }
}
