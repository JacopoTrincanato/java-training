package count_words;

public class CountWords {
    public static void main(String[] args) {
        String words = "Buongiorno a tutti";
        int count = 1;

        for (int i = 0; i < words.length() - 1; i++) {
            if (words.charAt(i) == ' ' && words.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println(count);
    }

}
