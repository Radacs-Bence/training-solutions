package week07d03;

import defaultconstructor.MonthLength;

public class Date {

    private final int year;
    private final int month;
    private final int day;

    private Date(int year, int month, int day) {
        if (!valid(year, month, day)){
            throw new IllegalArgumentException(String.format("Month or day is incorrect: Month: %d, Day: %d !", month, day));
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static Date of(int year, int month, int day){
        return new Date(year, month, day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public Date withYear(int year){
        int month = getMonth();
        int day = getDay();
        return new Date(year, month, day);
    }

    public Date withMonth(int month){
        int year = getYear();
        int day = getDay();
        return new Date(year, month, day);
    }

    public Date withDay(int day){
        int month = getMonth();
        int year = getYear();
        return new Date(year, month, day);
    }

    private boolean valid(int year, int month, int day){
        return month > 0 && month <= 12 && day > 0 && day <= calculateMonthLength(year, month);
    }

    private boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private int calculateMonthLength(int year, int month){
        int days = MonthLength.values()[month - 1].getNumOfDays();
        if (isLeapYear(year) && month == 2){
            days++;
        }
        return days;
    }

}
