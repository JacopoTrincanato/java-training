package count_vowels;

public class CountVowels {
    public static void main(String[] args) {
        countVowels("aeiou");
    }

    public static void countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }

        System.out.println("number of vowels: " + count);
    }
}
