package week11d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameLengthTest {

    @Test
    void getLengthsTest() {
        List<Integer> names = new NameLength().getLengths(List.of("Joe", "Jack", "Jane", "Jake", "George", "William"));
        Collections.sort(names);

        assertEquals(Arrays.asList(3, 4), names);
    }
}