package week15d04;

public enum CharType {

    VOWELS("aáeéiíoóöőuúüű"), CONSONANTS("bcdfghjklmnpqrstvwxyz"), OTHER("");

    private String charset;

    CharType(String charset) {
        this.charset = charset;
    }

    public String getCharset() {
        return charset;
    }

    public static CharType findType(int charCode){
        String character = Character.toString(charCode);
        if (CharType.VOWELS.getCharset().contains(character)){
            return VOWELS;
        }else if (CharType.CONSONANTS.getCharset().contains(character)){
            return CONSONANTS;
        }
        return OTHER;
    }

}
