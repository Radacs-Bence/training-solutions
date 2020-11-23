package schoolrecords;

import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject (Subject subject){
        boolean contains = false;
        for (Subject taught: taughtSubjects) {
            if (taught.getSubjectName().equals(subject.getSubjectName())){
                contains = true;
            }
        }
        return contains;
    }

}
