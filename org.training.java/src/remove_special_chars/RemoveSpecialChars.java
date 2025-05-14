package remove_special_chars;

public class RemoveSpecialChars {
    public static void main(String[] args) {

        String specialChars = "!@#$%^&*()-_=+\\|{};:/?.>< Hello World";
        specialChars = specialChars.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(specialChars);
    }
}
