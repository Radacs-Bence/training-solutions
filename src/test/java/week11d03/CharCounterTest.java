package week11d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    @Test
    void countCharsTest() {
        String[] chars = {"abc", "cba", "ab"};
        CharCounter charCounter = new CharCounter();

        assertEquals(2, charCounter.countChars(chars));
    }
}