package formatlocaleprintf;

import java.util.Locale;
import java.util.MissingFormatArgumentException;

public class PrintFormat {


    public String formatMessageWithIntegerParameters(String message, Integer i, Integer j){
        try {
            return String.format(message, i, j);
        } catch (MissingFormatArgumentException ex) {
            throw new IllegalArgumentException("Less objects then expected in format String!", ex);
        }
    }

    public String printFormattedText(Double number){
        String message = "Total is: %,.2f Ft";

        return String.format(new Locale("hu", "HU"), message, number);
    }
    public String printFormattedText(int count, String fruit){
        String message = "We counted %d %s in the basket";

        return String.format(message, count, fruit );
    }
    public String printFormattedText(int number){
        String message = "Right edge of numbers set at 4 spaces from text:%4d";

        return String.format(message, number);
    }
    public String printFormattedText(Integer i, Integer j, Integer k){
        String message = "Multiple objects containing text:%d\t%d\t%d";

        return String.format(message, i, j, k);
    }


}
