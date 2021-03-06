package week06d05;

public class Bottle {

    private BottleType type;
    private int filledUntil = 0;

    public Bottle(BottleType type) {
        this.type = type;
    }

    public static Bottle of(BottleType type){
        return new Bottle(type);
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
