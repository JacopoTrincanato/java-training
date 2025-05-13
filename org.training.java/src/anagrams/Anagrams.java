package anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {
    public static void main(String[] args) {
        findAnagrams("abccbabca", "abc");
    }

    public static void findAnagrams(String one, String two) {
        List<Integer> result = new ArrayList<>();

        // Verifica stringa vuota o nulla
        if (one == null || one.length() == 0) {
            System.out.println(result);
        }

        // Array per contare i caratteri della stringa 'two'
        int[] charCount = new int[26];
        for (char c : two.toCharArray()) {
            charCount[c - 'a']++;
        }

        int left = 0, right = 0, count = two.length();

        while (right < one.length()) {
            // Se il carattere è presente nella mappa (valore positivo), decrementa il
            // contatore
            if (charCount[one.charAt(right++) - 'a']-- >= 1) {
                count--;
            }

            // Se count arriva a 0, abbiamo trovato un anagramma
            if (count == 0) {
                result.add(left);
            }

            // Se la finestra ha raggiunto la lunghezza della parola 'two'
            // sposta il margine sinistro (left)
            if (right - left == two.length()) {
                if (charCount[one.charAt(left++) - 'a']++ >= 0) {
                    count++;
                }
            }
        }

        System.out.println(result);
    }
}
