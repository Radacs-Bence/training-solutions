package controlselection.consonant;

import java.util.Arrays;
import java.util.List;

public class ToConsonant {

    public char convertToConsonant(char character){
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
            character = (char) ((int)  character + 1);
        }
        return character;
    }


}
