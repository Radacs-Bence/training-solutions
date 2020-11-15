package controliteration.pi;

public class PiGenerator {

    private static final String PI_POET = "Nem a régi s durva közelítés,\n" +
            "Mi szótól szóig így kijön\n" +
            "Betűiket számlálva.\n" +
            "Ludolph eredménye már,\n" +
            "Ha itt végezzük húsz jegyen.\n" +
            "De rendre kijő még tíz pontosan,\n" +
            "Azt is bízvást ígérhetem.\n" +
            "\t";
    public static final String DECIMAL_SEPARATOR = ".";

    public String getPi(){
        String piText = "";
        int counter = 0;
        for (int i = 0; i < PI_POET.length(); i++){
            if (piText.length() == 1) {
                piText += DECIMAL_SEPARATOR;
            }
            char c = PI_POET.charAt(i);
            if (counter != 0 && !Character.isAlphabetic(PI_POET.charAt(i))){
                piText += counter;
                counter = 0;
            } else  if (Character.isAlphabetic(PI_POET.charAt(i))){
                counter++;
            }

        }
        return piText;
    }

}
