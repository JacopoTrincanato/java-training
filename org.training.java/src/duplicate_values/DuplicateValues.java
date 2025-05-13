package duplicate_values;

public class DuplicateValues {
    public static void main(String[] args) {
        int[] numbArr = { 1, 2, 2, 3, 3, 4, 4 };
        int[] clearArr = new int[numbArr.length];
        int j = 0;

        for (int i = 0; i < numbArr.length - 1; i++) {
            if (numbArr[i] != numbArr[i + 1]) {
                clearArr[j++] = numbArr[i];
            }
        }

        clearArr[j++] = numbArr[numbArr.length - 1];

        for (int k = 0; k < j; k++) {
            System.out.println(clearArr[k]);
        }

    }
}
