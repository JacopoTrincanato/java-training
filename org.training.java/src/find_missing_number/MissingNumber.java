package find_missing_number;

public class MissingNumber {
    public static void main(String[] args) {

        // array should not have duplicates
        // array doesn't need to be in a sorted order
        // values should be in range
        int[] arrOne = { 1, 2, 4, 5 };
        int sumOne = 0;

        for (int i = 0; i < arrOne.length; i++) {
            sumOne += arrOne[i];
        }

        int sumTwo = 0;

        for (int i = 1; i <= 5; i++) {
            sumTwo += i;
        }

        System.out.println("The missing number is: " + (sumTwo - sumOne));
    }
}
