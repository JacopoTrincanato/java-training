package check_array_equal;

import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {

        int[] arrOne = { 1, 2, 3, 4, 5 };
        int[] arrTwo = { 1, 2, 3, 4, 5 };

        boolean status = Arrays.equals(arrOne, arrTwo);

        if (status == true) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays aren't equals");
        }
    }
}
