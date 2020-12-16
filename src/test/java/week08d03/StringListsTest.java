package week08d03;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringListsTest {

    @Test
    public void shortestWordsTest() {
        StringList sl = new StringList();
        String text = sl.shortestWords(Arrays.asList("aaa", "aa", "bb", "cccc", "dd")).toString();
        assertEquals("[aa, bb, dd]", text);
    }

    @Test
    public void nullStringExceptionTest() {
        StringList sl = new StringList();

        Exception ex = assertThrows(NullPointerException.class, () -> sl.shortestWords(Arrays.asList(null, "aa", "bb", "cccc", "dd")));
        assertEquals("Words in list cannot be null", ex.getMessage());
    }

    @Test
    public void nullListExceptionTest() {
        StringList sl = new StringList();

        Exception ex = assertThrows(NullPointerException.class, () -> sl.shortestWords(null));
        assertEquals("Word list cannot be null!", ex.getMessage());
    }

}
