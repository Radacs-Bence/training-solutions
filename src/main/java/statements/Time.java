package statements;

public class Time {private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinutes() {
        return minute + (hour * 60);
    }

    public int getInSeconds() {
        return second + (getInMinutes() * 60);
    }

    public boolean earlierThan (Time than){
        return getInSeconds() < than.getInSeconds();
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
