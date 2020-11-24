package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    public void convertString (){
        String text = "The quick brown fox jumps over the lazy dog";
        String converted = new ChangeLetter().changeVowels(text);
        assertEquals("Th* q**ck br*wn f*x j*mps *v*r th* l*zy d*g", converted);
    }


}
