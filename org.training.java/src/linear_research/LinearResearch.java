package linear_research;

public class LinearResearch {
    public static void main(String[] args) {

        int[] arrayNumber = { 10, 20, 30, 40, 50 };
        int searchElement = 50;
        boolean flag = false;

        for (int i = 0; i < arrayNumber.length; i++) {
            if (searchElement == arrayNumber[i]) {
                flag = true;
                System.out.println("Element found at position: " + i);
            }

        }

        if (flag == false) {
            System.out.println("Element not found");
        }
    }
}
