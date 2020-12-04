package week06d05;

public class Bottle {

    private BottleType type;
    private int filledUntil;

    public Bottle(BottleType type, int filledUntil) {
        this.type = type;
        this.filledUntil = filledUntil;
    }

    public static Bottle of(BottleType type){
        return new Bottle(type, 0);
    }

    public void fill(int fillAmount){
        if (filledUntil + fillAmount > type.getMaximumAmount()){
            throw new IllegalArgumentException("The bottle overflows if it's filled by " + fillAmount);
        }
        filledUntil += fillAmount;
    }

    public BottleType getType() {
        return type;
    }

    public int getFilledUntil() {
        return filledUntil;
    }
}
