package inheritanceconstructor.classroom;

public class ClassRoom extends Room{

    private Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public boolean isSuitable(Course course){
        boolean suitable = false;
        if (course.getFacilityNeeded() == facility){
            suitable = true;
        }
        return suitable;
    }

    public Facility getFacility() {
        return facility;
    }
}
