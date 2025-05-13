package reverse_array;

public class ReverseArray {
    public static void main(String[] args) {

        int[] multipliDue = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int[] arrayInvertito = new int[multipliDue.length];

        for (int i = multipliDue.length - 1; i >= 0; i--) {
            int j = arrayInvertito.length - 1 - i;
            arrayInvertito[j] = multipliDue[i];
            System.out.println(arrayInvertito[j]);
        }
    }
}
