package week13d02;

import org.junit.jupiter.api.Test;
import week12d02.ReadFromFile;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class ResultsReaderTest {

    private InputStream inputStream = ResultsReader.class.getResourceAsStream("results.txt");


    @Test
    void isCorrectTest() {
        ResultsReader resultsReader = new ResultsReader(inputStream);

        assertTrue(resultsReader.isCorrect("AB123", 1));
        assertTrue(resultsReader.isCorrect("GH1234", 2));
        assertFalse(resultsReader.isCorrect("BD452", 3));

    }

    @Test
    void mostXTest() {
        ResultsReader resultsReader = new ResultsReader(inputStream);

        assertEquals("BD452", resultsReader.mostX());

    }

    @Test
    void winnerTest() {
        ResultsReader resultsReader = new ResultsReader(inputStream);

        assertEquals("GH1234", resultsReader.winner());
    }
}