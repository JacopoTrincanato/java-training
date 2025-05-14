package sort_elements_with_built_in_methods;

import java.util.Arrays;
import java.util.Collections;

public class SortElements {
    public static void main(String[] args) {

        // approach 1
        int[] numbers = { 30, 20, 50, 80, 10 };
        System.out.println("Array before sorting" + Arrays.toString(numbers));

        Arrays.parallelSort(numbers);
        System.out.println("Array after sorting" + Arrays.toString(numbers));

        // approach 2
        Integer[] numbersTwo = { 15, 5, 95, 45, 105 };
        System.out.println("Array before sorting" + Arrays.toString(numbersTwo));

        Arrays.sort(numbersTwo);
        System.out.println("Array after sorting" + Arrays.toString(numbersTwo));

        // reverse order
        Arrays.sort(numbersTwo, Collections.reverseOrder());
        System.out.println("Array sorted in reverse order" + Arrays.toString(numbersTwo));
    }
}
