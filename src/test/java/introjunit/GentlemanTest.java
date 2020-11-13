package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void nameTest (){
        //Given
        String name = "John Doe";

        //When
        String gentleman = new Gentleman().sayHello(name);

        //Then
        assertEquals("Hello John Doe!", gentleman);

    }
    @Test
    void noNameTest (){
        //Given
        String name = null;

        //When
        String gentleman = new Gentleman().sayHello(name);

        //Then
        assertEquals("Hello Anonymous!", gentleman);

    }

}
