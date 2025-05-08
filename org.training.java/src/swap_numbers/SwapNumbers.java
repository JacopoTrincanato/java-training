package swap_numbers;

public class SwapNumbers {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 20;

        System.out.println("Before swapping values are... " + numberOne + " " + numberTwo);

        // create a third variable that allows us to swap the values
        int numberThree = numberOne;
        numberOne = numberTwo;
        numberTwo = numberThree;

        System.out.println("After swapping values are... " + numberOne + " " + numberTwo);
    }
}
