package controlselection.month;

public class DayInMonth {


    public int numberOfDays(int year, String month) {
        int numberOfDays = 0;
        boolean isLeapYear = false;

        if (year % 4 != 0){
            isLeapYear = false;
        } else if (year % 100 != 0){
            isLeapYear = true;
        } else if (year % 400 != 0){
            isLeapYear = false;
        } else {
            isLeapYear = true;
        }

        switch (month.toLowerCase()){
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                numberOfDays = 31;
                break;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                numberOfDays = 30;
                break;
            case "február":
                if (isLeapYear){
                numberOfDays = 29;
                } else{
                numberOfDays = 28;
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);

        }

        return numberOfDays;
    }
}
