package binary_research;

public class BinaryResearch {
    public static void main(String[] args) {

        // should be in sorted order
        int[] arrayNumber = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int key = 50;
        int index = 0;
        int highestPosition = arrayNumber.length - 1;
        boolean flag = false;

        while (index <= highestPosition) {
            int mediumPosition = (index + highestPosition) / 2;
            if (arrayNumber[mediumPosition] == key) {
                System.out.println("Element Found");
                flag = true;
                break;
            } else if (arrayNumber[mediumPosition] < key) {
                index = mediumPosition + 1;
            } else if (arrayNumber[mediumPosition] > key) {
                highestPosition = mediumPosition - 1;
            }
        }

        if (flag == false) {
            System.out.println("Element not Found");
        }
    }
}
