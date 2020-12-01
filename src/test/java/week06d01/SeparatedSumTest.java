package week06d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparatedSumTest {

    @Test
    public void SeparatedSum(){
        assertEquals(30.0, new SeparatedSum().sum("5;6,3;-4;3,7;-2,5;7.5;-3,5;7.5").getPositiveSum());
        assertEquals(-10.0, new SeparatedSum().sum("5;6,3;-4;3,7;-2,5;7.5;-3,5;7.5").getNegativeSum());
    }

}
