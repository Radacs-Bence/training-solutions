package week15d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    @Test
    void readAndCount() {

        Path path = Path.of("src/test/resources/stuff.txt");

        CharCounter charCounter = new CharCounter();

        assertEquals(11, charCounter.readAndCount(path).get(CharType.OTHER));
    }
}