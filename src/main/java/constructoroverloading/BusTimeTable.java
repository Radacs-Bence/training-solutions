package constructoroverloading;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        timeTable = new ArrayList();
        for (int i = firstHour; i <= lastHour; i++){
            timeTable.add(new SimpleTime(i, everyMinute));
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime nextBus(SimpleTime actual){
        if (latestBus().difference(actual) < 0){
            throw new IllegalStateException("No more buses today!");
        }
        return findClosestTime(actual);
    }

    public SimpleTime earliestBus(){
        SimpleTime morning = new SimpleTime(0, 0);
        return findClosestTime(morning);
    }

    public SimpleTime latestBus(){
        SimpleTime late = timeTable.get(0);
        SimpleTime midnight = new SimpleTime(24, 0);
        for (SimpleTime time: timeTable) {
            if(midnight.difference(late) > midnight.difference(time)){
                late = time;
            }
        }
        return late;
    }

    private SimpleTime findClosestTime(SimpleTime target){
        SimpleTime closest = timeTable.get(0);
        for (SimpleTime time: timeTable) {
            int closestDiff = Math.abs(closest.difference(target));
            int timeDiff = Math.abs(time.difference(target));
            if(timeDiff < closestDiff && time.difference(target) >= 0){
                closest = time;
            }
        }
        return closest;
    }

}
