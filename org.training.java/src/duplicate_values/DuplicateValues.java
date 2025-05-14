package duplicate_values;

public class DuplicateValues {
    public static void main(String[] args) {
        int[] numbArr = { 1, 2, 2, 3, 3, 4, 4 };
        int[] clearArr = new int[numbArr.length];
        int j = 0;

        // find duplicate values
        boolean flag = false;
        for (int i = 0; i < numbArr.length; i++) {
            for (int l = i + 1; l < numbArr.length; l++) {
                if (numbArr[i] == numbArr[l]) {
                    System.out.println("the duplicate value is: " + numbArr[i]);
                    flag = true;
                }
            }
        }

        if (flag == false) {
            System.out.println("Duplicates not found");
        }

        // remove duplicate values
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
