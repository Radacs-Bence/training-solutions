package datenewtypes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Rendezvous {

    private LocalTime time;

    public Rendezvous(int hour, int minute) {
        time = LocalTime.of(hour, minute);
    }

    public Rendezvous(String time, String pattern){
        patternCheck(pattern);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        try {
            this.time = LocalTime.parse(time, formatter);
        } catch (DateTimeParseException ex) {
            throw new IllegalArgumentException("Illegal time string: " + time);
        }
    }

    public String toString(String pattern){
        patternCheck(pattern);
        return DateTimeFormatter.ofPattern(pattern).format(time);
    }

    public int countMinutesLeft(LocalTime from){
        int minutesLeft = (int) ChronoUnit.MINUTES.between(from, time);
        if (minutesLeft <= 0){
            throw new MissedOpportunityException("Too late!");
        }
        return minutesLeft;
    }

    public void pushLater(int hours, int minutes){
        time = time.plusHours(hours).plusMinutes(minutes);
    }

    public void pullEarlier(int hours, int minutes){
        time = time.minusHours(hours).minusMinutes(minutes);
    }

    private void patternCheck(String pattern) {
        if (pattern == null || pattern.isBlank()) {
            throw new IllegalArgumentException("Empty pattern string!");
        }
    }
}
