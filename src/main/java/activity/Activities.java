package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();

        for (ActivityType activityType : ActivityType.values()) {
            double distance = distanceOfOneType(activityType);
            reports.add(new Report(activityType, distance));
        }

        return reports;
    }

    private double distanceOfOneType(ActivityType activityType) {
        double distance = 0.0;
        for (Activity activity : activities) {
            if (activity.getType() == activityType) {
                distance += activity.getDistance();
            }
        }
        return distance;
    }

    public int numberOfTrackActivities() {
        int counter = 0;
        for (Activity activity : activities) {
            if (ActivityWithTrack.class.isInstance(activity)){
                counter++;
            }
        }
        return counter;
    }

    public int numberOfWithoutTrackActivities() {
        int counter = 0;
        for (Activity activity : activities) {
            if (ActivityWithoutTrack.class.isInstance(activity)){
                counter++;
            }
        }
        return counter;
    }

}
