package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word){
        if (word == null){
            throw new IllegalArgumentException("Text must not be null!");

        }
        StringBuilder sB = new StringBuilder(word.toLowerCase().trim());
        String forwards = sB.toString();
        String backwards = sB.reverse().toString();
        return forwards.equals(backwards);
    }

}
