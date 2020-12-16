package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    public List<String> shortestWords(List<String> words) {
        valid(words);
        int shortest = shortestWordLength(words);
        List<String> shortestWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == shortest) {
                shortestWords.add(word);
            }
        }
        return shortestWords;
    }

    private int shortestWordLength(List<String> words) {
        int shortest = words.get(0).length();
        for (String word : words) {
            if (word.length() < shortest) {
                shortest = word.length();
            }
        }
        return shortest;
    }

    private void valid(List<String> words) {
        if (words == null) {
            throw new NullPointerException("Word list cannot be null!");
        }
        for (String word : words) {
            if (word == null) {
                throw new NullPointerException("Words in list cannot be null");
            }
        }
    }

}
