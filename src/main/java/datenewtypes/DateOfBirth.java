package datenewtypes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateOfBirth {

    private LocalDate dateOfBirth;


    public DateOfBirth(int year, int month, int day) {
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    public DateOfBirth(String date, String pattern, Locale locale) {
        patternCheck(pattern);
        localeCheck(locale);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, locale);
        dateOfBirth = LocalDate.parse(date, formatter);
    }

    public DateOfBirth(String date, String pattern){
        patternCheck(pattern);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        dateOfBirth = LocalDate.parse(date, formatter);
    }

    public String findDayOfWeekForBirthDate(Locale locale) {
        localeCheck(locale);
        return dateOfBirth.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }

    public String findDayOfWeekForBirthDate(Locale locale, LocalDate otherBirthday) {
        localeCheck(locale);
        return otherBirthday.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }

    public int countDaysSinceBirth(LocalDate endDay) {
        if (endDay.isBefore(dateOfBirth)) {
            throw new IllegalStateException("Birthdate is in the future!");
        }
        return (int) ChronoUnit.DAYS.between(dateOfBirth, endDay);
    }

    public int countDaysBetween(DateOfBirth otherBirthday) {
        return (int) ChronoUnit.DAYS.between(dateOfBirth, otherBirthday.getDateOfBirth());
    }

    public String toString(String pattern) {
        patternCheck(pattern);
        return DateTimeFormatter.ofPattern(pattern).format(dateOfBirth);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    private void patternCheck(String pattern) {
        if (pattern == null || pattern.isBlank()) {
            throw new IllegalArgumentException("Empty pattern string, cannot use: " + pattern);
        }
    }

    private void localeCheck(Locale locale){
        if (locale == null) {
            throw new NullPointerException("Locale must not be null!");
        }
    }
}
