package week14d05;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class WordCounter {

    public static final String CHARSET_NAME = "windows-1250";
    public static final String NAME = "Hach";
    public static final String WORD_SEPARATOR = " ";


    public long countName(String file){
        long amount = 0;
        Path path = Path.of(file);
        try{
            amount = Files.lines(path, Charset.forName(CHARSET_NAME))
                    .filter(WordCounter::containsName)
                    .flatMap(WordCounter::linesToWords)
                    .filter(WordCounter::containsName)
                    .count();
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file!");
        }
        return amount;
    }

    private static boolean containsName(String s) {
        return s.contains(NAME);
    }

    private static Stream<? extends String> linesToWords(String line) {
        return Arrays.stream(line.split(WORD_SEPARATOR));
    }

}
