package week12d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AgeSorterTest {

    @Test
    void sortAges() {
        AgeSorter ageSorter = new AgeSorter();
        int[] ages = {23, 4, 55, 100, 12, 60, 4};
        int[] solution = ageSorter.sortAges(ages);
        assertEquals(Arrays.toString(new int[]{4, 4, 12, 23, 55, 60, 100}),Arrays.toString(solution));
    }
}