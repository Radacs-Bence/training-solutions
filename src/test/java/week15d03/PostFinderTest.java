package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    void findPosts() {
        List<Post> testData = Arrays.asList(
                new Post("a", LocalDate.of(2018, 1, 6), LocalDate.of(2019, 6, 19), "xyz", "x"),
                new Post("b", LocalDate.of(2019, 3, 18), null, "xyz", "x"),
                new Post("c", LocalDate.of(2021, 2, 20), null, "xyz", "x"),
                new Post("", LocalDate.of(2019, 3, 18), null, "xyz", "x"),
                new Post("d", LocalDate.of(2021, 2, 20), null, "", "x"),
                new Post(null, LocalDate.of(2019, 3, 18), null, "xyz", "x"),
                new Post("e", LocalDate.of(2021, 2, 20), null, null, "x"),
                new Post("f", LocalDate.of(2019, 3, 18), null, "xyz", "y"),
                new Post("g", LocalDate.of(2021, 2, 20), null, "xyz", "y")
        );

        PostFinder postFinder = new PostFinder(testData);
        assertEquals(Arrays.asList("b", "c", "f").toString(), postFinder.findPosts("x").toString());
    }
}