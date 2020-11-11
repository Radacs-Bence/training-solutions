package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    private Day nextDay(Day day){
        Day nextDay = null;
        if(day.ordinal() == (day.values().length - 1)){
            nextDay = day.values()[0];
        }else {
            nextDay = Day.values()[day.ordinal() + 1];
        }
        return nextDay;

    }

    List<DayType> dayTypes(Day firstDay, int numberOfDays){
        List<DayType> types = new ArrayList<>();
        for (int i = 0; i < numberOfDays; i++){
            types.add(firstDay.getDayType());
            firstDay = nextDay(firstDay);
        }
        return types;
    }


}
