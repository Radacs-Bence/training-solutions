package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SultanTest {

    @Test
    public void sultanBirthdayTest() {
        Sultan sultan = new Sultan();

    assertEquals("[1. ajtó, 4. ajtó, 9. ajtó, 16. ajtó, 25. ajtó, 36. ajtó, 49. ajtó, 64. ajtó, 81. ajtó, 100. ajtó]", sultan.birthday().toString());
    }
}
