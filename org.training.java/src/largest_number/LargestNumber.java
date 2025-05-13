package largest_number;

import java.util.Random;

public class LargestNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int numOne = random.nextInt(1000);
        int numTwo = random.nextInt(1000);
        int numThree = random.nextInt(1000);

        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(numThree);

        if (numOne > numTwo && numOne > numThree) {
            System.out.println("The longest number is " + numOne);
        } else if (numTwo > numOne && numTwo > numThree) {
            System.out.println("The longest number is " + numTwo);
        } else if (numThree > numTwo && numThree > numOne) {
            System.out.println("The longest number is " + numThree);
        }

    }
}
