package week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamplesStoreTest {

    @Test
    public void titlesTest() {
        ExamplesStore es = new ExamplesStore();
        es.getTitlesOfExamples();

        assertEquals("[Első feladat, Második feladat]", es.getTitles().toString());
    }

}
