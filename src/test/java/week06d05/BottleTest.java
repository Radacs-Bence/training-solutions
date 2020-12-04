package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BottleTest {

    @Test
    public void bottle(){
        Bottle bottleGlass = Bottle.of(BottleType.GLASS_BOTTLE);

        assertEquals(100, bottleGlass.getFilledUntil());
        assertEquals(BottleType.GLASS_BOTTLE, bottleGlass.getType());
    }

    @Test
    public void fill(){
        Bottle bottleGlass = Bottle.of(BottleType.PET_BOTTLE);
        bottleGlass.fill(50);

        assertEquals(150, bottleGlass.getFilledUntil());
    }

    @Test
    public void overflow(){
        Bottle bottleGlass = Bottle.of(BottleType.PET_BOTTLE);


        Exception ex = assertThrows(IllegalArgumentException.class, () -> bottleGlass.fill(250));
        assertEquals("The bottle overflows if it's filled by 250", ex.getMessage());
    }

}
