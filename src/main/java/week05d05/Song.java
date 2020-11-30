package week05d05;

public class Song {

        private String name;
        private long lengthInSeconds;
        private String artist;

    public Song(String name, long lengthInSeconds, String artist) {
        validator(name, lengthInSeconds, artist);
        this.name = name;
        this.lengthInSeconds = lengthInSeconds;
        this.artist = artist;
    }

    public long getLengthInSeconds() {
        return lengthInSeconds;
    }

    private boolean isEmpty(String string) {
        return string == null || string.isBlank();
    }

    private void validator (String name, long lengthInSeconds, String artist){
        boolean invalid = false;
        StringBuilder text = new StringBuilder();
        if (isEmpty(name) ){
            invalid = true;
            text.append(String.format("Dalcím: %s nem elfogadható! ", name));
        }
        if ( isEmpty(artist) ){
            invalid = true;
            text.append(String.format("Előadó: %s nem elfogadható! ", artist));
        }
        if (lengthInSeconds <= 0){
            invalid = true;
            text.append(String.format("Hossz: %d másodperc nem elfogadható! ", lengthInSeconds));
        }
               throw new IllegalArgumentException(text.toString());
    }


}
