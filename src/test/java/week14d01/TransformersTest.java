package week14d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransformersTest {

    @Test
    void mapTest() {

        assertEquals( Arrays.asList(2, 3, 4), new Transformers().map(Arrays.asList(1, 2, 3), (value) -> value + 1));
    }

    @Test
    void reduceTest() {
        assertEquals(6,new Transformers().reduce(Arrays.asList(1, 2, 3), 0, Integer::sum));
    }


}