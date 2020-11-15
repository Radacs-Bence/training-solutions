package stringbasic.stringbasic;

public class StringCreator {

    public String createStringForHeap(){
        return new String("Autó");
    }

    public String createStringForPool(){
        return "Autó";
    }

}
