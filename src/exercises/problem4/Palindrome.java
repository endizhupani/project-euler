package exercises.problem4;

/**
 * Created by edmondzhupani on 26/02/2017.
 */
public class Palindrome {
    private String text;

    public Palindrome(String text) {
        this.text = text;

    }

    public boolean isPalindrome() {
        char[] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length - i; i++) {
            if (textArray[i] != textArray[textArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
