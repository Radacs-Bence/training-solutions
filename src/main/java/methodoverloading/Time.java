package methodoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time) {
        this.hours = time.hours;
        this.minutes= time.minutes;
        this.seconds = time.seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time){
        return inSeconds(this) == inSeconds(time);
    }
    public boolean isEqual(int hours, int minutes, int seconds){
        return inSeconds(this) == inSeconds(hours, minutes, seconds);
    }
    public boolean isEarlier(Time time){
        return inSeconds(this) < inSeconds(time);
    }
    public boolean isEarlier(int hours, int minutes, int seconds){
        return inSeconds(this) < inSeconds(hours, minutes, seconds);
    }

    private int inSeconds(Time time){
        return (time.getHours() * 3600) + (time.getMinutes() * 60) + time.getSeconds();
    }

    private int inSeconds(int hours, int minutes, int seconds){
        return (hours * 3600) + (minutes * 60) + seconds;
    }

}
