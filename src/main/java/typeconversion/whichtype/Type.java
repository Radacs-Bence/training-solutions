package typeconversion.whichtype;

public enum Type {


    BYTE(Byte.MIN_VALUE,Byte.MAX_VALUE),
    SHORT(Short.MIN_VALUE, Short.MAX_VALUE),
    INT(Integer.MIN_VALUE, Integer.MAX_VALUE);

    private long minimum;

    private long maximum;

    Type(long minimum, long maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public long getMinimum() {
        return minimum;
    }

    public long getMaximum() {
        return maximum;
    }
}
