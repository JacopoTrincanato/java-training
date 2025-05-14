package check_array_equal;

import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {

        // approach 1
        int[] arrOne = { 1, 2, 3, 4, 5 };
        int[] arrTwo = { 1, 2, 3, 4, 5 };

        boolean status = Arrays.equals(arrOne, arrTwo);

        if (status == true) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays aren't equals");
        }

        // approach 2
        boolean newStatus = true;

        if (arrOne.length == arrTwo.length) {

            for (int i = 0; i < arrOne.length; i++) {
                if (arrOne[i] != arrTwo[i]) {
                    newStatus = false;
                }
            }
        } else {
            newStatus = false;
        }

        if (newStatus == true) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays aren't equals");
        }
    }
}
