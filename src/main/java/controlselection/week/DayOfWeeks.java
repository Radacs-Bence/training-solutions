package controlselection.week;

public class DayOfWeeks {

    public String whichDay(String day){
        String dayType;
        switch(day.toLowerCase()){
            case "hétfő":
                dayType="hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                dayType="hét közepe";
                break;
            case "péntek":
                dayType="majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                dayType="hét vége";
                break;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }

        return dayType;

    }

}
