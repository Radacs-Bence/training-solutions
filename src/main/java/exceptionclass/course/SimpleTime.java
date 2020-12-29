package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;

    public static final String SEPARATOR = ":";

    public SimpleTime(int hour, int minute) {
        setTime(hour, minute);
    }

    public SimpleTime(String timeAsStirng) {
        if (timeAsStirng == null) {
            throw new InvalidTimeException("Time is null");
        }
        String[] timeParts = timeAsStirng.split(SEPARATOR);
        try {
            setTime(Integer.parseInt(timeParts[0]), Integer.parseInt(timeParts[1]));
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
    }

    private void setTime(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}
