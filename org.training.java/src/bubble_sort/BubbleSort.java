package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = { 4, 6, 3, 8, 5, 9, 7 };
        System.out.println("Array before sorting" + Arrays.toString(numbers));

        // bubble sorting
        int length = numbers.length;

        // number of process
        for (int i = 0; i < length - 1; i++) {

            // number of iterations
            for (int j = 0; j < length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting" + Arrays.toString(numbers));
    }
}
