package week15d04;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharCounter {


    public Map<CharType, Long> readAndCount(Path path)  {
        try(Stream<String> text = Files.lines(path, StandardCharsets.UTF_8)){
            return text
                .map(String::toLowerCase)
                .flatMapToInt(String::chars)
                .filter(i -> i != 32)
                .mapToObj(CharType::findType)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file!");
        }

    }

}

