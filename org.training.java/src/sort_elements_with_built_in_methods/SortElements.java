package sort_elements_with_built_in_methods;

import java.util.Arrays;

public class SortElements {
    public static void main(String[] args) {

        int[] numbers = { 30, 20, 50, 80, 10 };
        System.out.println("Array before sorting" + Arrays.toString(numbers));

        // approach 1
        Arrays.parallelSort(numbers);
        System.out.println("Array after sorting" + Arrays.toString(numbers));
    }
}
