package fibonacci_series;

public class FibonacciSeries {
    public static void main(String[] args) {

        int numOne = 0;
        int numTwo = 1;
        int sum = 0;

        for (int i = 2; i < 10; i++) {
            sum = numOne + numTwo;
            System.out.println(" " + sum);
            numOne = numTwo;
            numTwo = sum;
        }
    }

}
