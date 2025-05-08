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

        // swap values in a different ways using addictions and subtractions
        numberOne = numberOne + numberTwo; // 10+20=30
        numberTwo = numberOne - numberTwo; // 30-20=10
        numberOne = numberOne - numberTwo; // 30-10=20

        // swap numbers using moltiplications and divisions. Here numberOne and
        // numberTwo values cannot be zero
        numberOne = numberOne * numberTwo; // 10*20=200
        numberTwo = numberOne / numberTwo; // 200/20=10
        numberOne = numberOne / numberTwo; // 200/10=20
    }
}
