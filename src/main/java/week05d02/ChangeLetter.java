package week05d02;

public class ChangeLetter {

    private String vowels = "aeiouAEIOU";

    public char convertVowels(char character){
        int index = vowels.indexOf(character);
        if (index >= 0){
            character = '*';
        }
        return character;
    }

    public String changeVowels (String str) {
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            response.append(convertVowels(str.charAt(i)));
        }
        return response.toString();
    }
}
