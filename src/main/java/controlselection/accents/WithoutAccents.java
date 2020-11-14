package controlselection.accents;

public class WithoutAccents {

    private String accented = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";
    private String accentless = "aeiooouuuAEIOOOUUU";

    public char convertToCharWithoutAccents(char character){
        int index = accented.indexOf(character);
        if (index >= 0){
            character = accentless.charAt(index);
        }
        return character;
    }

}
