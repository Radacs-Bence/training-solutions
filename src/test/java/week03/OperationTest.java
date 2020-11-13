package week03;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {


    @Test
    void nameTest (){
        //Given
        String addition = "123+56";

        //When
        Operation operation = new Operation("123+56");
        int result = operation.getResult();

        //Then
        assertEquals(123 + 56, result);


    }

}
