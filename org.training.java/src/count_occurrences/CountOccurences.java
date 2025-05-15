package count_occurrences;

public class CountOccurences {
    public static void main(String[] args) {

        String myString = "Java Programming Java oops";
        int length = myString.length();

        int replacement = myString.replace("a", "").length();
        int count = length - replacement;

        System.out.println("Number of occurences of a is: " + count);

    }
}
