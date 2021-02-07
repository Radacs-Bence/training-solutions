package lambdaintro;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.List;

public class FamilyBirthdays {

    private List<LocalDate> birthdays;

    public FamilyBirthdays(List<LocalDate> birthdays) {
        this.birthdays = birthdays;
    }

    public FamilyBirthdays(LocalDate... birthdays) {
        this.birthdays = Arrays.asList(birthdays);
    }

    public boolean isFamilyBirthday(TemporalAccessor date) {
        boolean contains = false;
        for (LocalDate birthday : birthdays) {
            if (birthday.get(ChronoField.MONTH_OF_YEAR) == date.get(ChronoField.MONTH_OF_YEAR)
                    && birthday.get(ChronoField.DAY_OF_MONTH) == date.get(ChronoField.DAY_OF_MONTH)) {
                contains = true;
            }
        }
        return contains;
    }

    public long nextFamilyBirthDay(TemporalAccessor date) {
        int min = Integer.MAX_VALUE;
        LocalDate dateAsLocalDate = LocalDate.of(date.get(ChronoField.YEAR), date.get(ChronoField.MONTH_OF_YEAR), date.get(ChronoField.DAY_OF_MONTH));
        for (LocalDate birthday : birthdays) {
            LocalDate birthdayThisYear = birthday.withYear(date.get(ChronoField.YEAR));
            int difference = (int) ChronoUnit.DAYS.between(dateAsLocalDate, birthdayThisYear);
            if (difference < 0){
                difference += 365;
            }
            if (difference < min){
                min = difference;
            }
        }
        return min;
    }

}
