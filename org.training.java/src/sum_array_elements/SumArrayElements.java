package sum_array_elements;

public class SumArrayElements {
    public static void main(String[] args) {

        int[] numbArr = { 5, 2, 7, 9, 6 };
        int sum = 0;

        for (int i = 0; i < numbArr.length; i++) {
            sum += numbArr[i];
        }

        System.out.println(sum);
    }
}
