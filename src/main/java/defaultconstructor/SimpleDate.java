package defaultconstructor;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (!isCorrect(year, month, day)){
            throw new IllegalArgumentException(String.format("One or more given parameter cannot be applied! %d, %d, %d", year, month, day));
        }
        this.year = year;
        this.month = month;
        this.day = day;
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

    private boolean isCorrect(int year, int month, int day){
        return year >= 1900 && month >= 1 && month <= 12 && day >= 1 && day <= calculateMonthLength(year, month);
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
