package reverse_string;

public class ReverseString {
    public static void main(String[] args) {
        // use string concatenation operator(+)
        String string = "abcd";
        String reverseString = "";

        int stringLength = string.length();

        for (int i = stringLength - 1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);
        }

        System.out.println(reverseString);

        // use chars array
        char[] charArr = string.toCharArray();

        for (int i = charArr.length - 1; i >= 0; i--) {
            reverseString = reverseString + charArr[i];
        }

        // use stringBuffer
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.reverse();
    }
}
