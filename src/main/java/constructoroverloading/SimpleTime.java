package constructoroverloading;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(SimpleTime simpleTime) {
        this(simpleTime.getHours(), simpleTime.getMinutes());
    }

    public int difference(SimpleTime time){
        return toMinutes(this) - toMinutes(time);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return String.format("%d:%d", hours, minutes);
    }

    private int toMinutes(SimpleTime time){
        return (time.hours * 60) + time.minutes;
    }



}
