package datenewtypes;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FamilyBirthdays {

    private List<LocalDate> birthdays;

    public FamilyBirthdays(LocalDate... birthdays) {
        this.birthdays = Arrays.asList(birthdays);
    }

    public boolean isFamilyBirthday(TemporalAccessor temporalAccessor) {
        int month = temporalAccessor.get(ChronoField.MONTH_OF_YEAR);
        int day = temporalAccessor.get(ChronoField.DAY_OF_MONTH);

        return birthdays.stream()
                .anyMatch(x -> (x.get(ChronoField.MONTH_OF_YEAR) == month) && (x.get(ChronoField.DAY_OF_MONTH) == day));
    }

    public int nextFamilyBirthDay(TemporalAccessor temporalAccessor) {
        return birthdays.stream().mapToInt(x -> (int) ChronoUnit.DAYS.between((Temporal) temporalAccessor, yearDecider(x, temporalAccessor))).min().getAsInt();
    }

    private LocalDate yearDecider(LocalDate date, TemporalAccessor temporalAccessor) {
        int searchedYear = temporalAccessor.get(ChronoField.YEAR);
        int searchedMonth = temporalAccessor.get(ChronoField.MONTH_OF_YEAR);
        int searchedDay = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
        int birthdayMonth = date.get(ChronoField.MONTH_OF_YEAR);
        int birthdayDay = date.get(ChronoField.DAY_OF_MONTH);
        LocalDate afterDate = LocalDate.of(searchedYear, searchedMonth, searchedDay);
        LocalDate birthDayDate = LocalDate.of(searchedYear, birthdayMonth, birthdayDay);

        if (birthDayDate.isBefore(afterDate)) {
            birthDayDate = birthDayDate.plus(Period.ofYears(1));
        }
        return birthDayDate;
    }
}
