package numb_of_digits;

public class NumbOfDigits {
    public static void main(String[] args) {
        int num = 123456;
        int count = 0;

        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            num = num / 10;
            count++;

            if (num % 2 == 1) {
                evenCount++;
            }

            if (num % 2 == 0) {
                oddCount++;
            }
        }

        System.out.println("Number of digits: " + count);
        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);
    }
}
