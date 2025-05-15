package reverse_all_words;

public class ReverseAllWords {
    public static void main(String[] args) {

        String myString = "Welcome to Java";

        // split words
        String[] words = myString.split(" ");

        // reverse the words
        String reverseString = "";

        for (String word : words) {
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }

            reverseString += (reverseWord + " ");
        }

        System.out.println(reverseString);
    }
}
