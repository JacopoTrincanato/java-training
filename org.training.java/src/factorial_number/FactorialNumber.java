package factorial_number;

public class FactorialNumber {
    public static void main(String[] args) {

        int num = 15;
        int numTwo = 10;
        long factorial = 1;
        long factorialTwo = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        // alternative way
        for (int i = numTwo; i >= 1; i--) {
            factorialTwo = factorialTwo * i;
        }

        System.out.println(factorial);
        System.out.println(factorialTwo);
    }
}
