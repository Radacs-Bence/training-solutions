package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {

    public String greetingByTime(int hour, int minute){
        int time = (hour * 60) + minute;
        int morning = 300;      // 5:00
        int noon = 540;         // 9:00
        int evening = 1_110;    //18:30
        int night = 1_200;      //20:00
        String text = "";
        if (time > morning && time <= noon){
            text = "Jó reggelt!";
        } else if (time > noon && time <= evening){
            text = "Jó napot!";
        } else if (time > evening && time <= night){
            text = "Jó estét!";
        } else if (time > night || time <= morning){
            text = "Jó éjt!";
        }
        return text;
    }

}
