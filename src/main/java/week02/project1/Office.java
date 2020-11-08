package week02.project1;

import java.util.ArrayList;
import java.util.List;

public class Office {

    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom (MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            MeetingRoom element = meetingRooms.get(i);
            System.out.print(element.getName() + ", ");
        }
        System.out.println("\n");
    }


    public void printNamesReverse() {
        for (int i = meetingRooms.size()-1; i > 0; i--) {
            MeetingRoom element = meetingRooms.get(i);
            System.out.print(element.getName() + ", ");
        }
        System.out.println("\n");
    }


    public void printEvenNames() {
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            MeetingRoom element = meetingRooms.get(i);
            System.out.print(element.getName() + ", ");
        }
        System.out.println("\n");
    }


    public void printAreas() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            MeetingRoom element = meetingRooms.get(i);
            System.out.println(element.getName() + ": Szélesség: " + element.getWidth()
                    + "; Hosszúság: " + element.getLength() + "; Terület: " + element.getArea());
        }
        System.out.println("\n");
    }

    public void printMeetingRoomsWithName(String name) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            MeetingRoom element = meetingRooms.get(i);
            if (element.getName().equals(name)){
                System.out.println(element.getName() + ": Szélesség: " + element.getWidth()
                        + "; Hosszúság: " + element.getLength() + "; Terület: " + element.getArea());
            }
        }
        System.out.println("\n");
    }

    public void printMeetingRoomsContains(String part) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            MeetingRoom element = meetingRooms.get(i);
            String noCapitals = element.getName().toLowerCase();
            if (noCapitals.indexOf(part) > -1){
                System.out.println(element.getName() + ": Szélesség: " + element.getWidth()
                        + "; Hosszúság: " + element.getLength() + "; Terület: " + element.getArea());
            }
        }
        System.out.println("\n");
    }

    public void printAreasLargerThan(int area) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            MeetingRoom element = meetingRooms.get(i);
            if (element.getArea() > area){
                System.out.println(element.getName() + ": Szélesség: " + element.getWidth()
                        + "; Hosszúság: " + element.getLength() + "; Terület: " + element.getArea());
            }
        }
        System.out.println("\n");
    }
}
