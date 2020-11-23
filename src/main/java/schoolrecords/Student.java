package schoolrecords;


import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if (isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage(){
        double average = 0.0;
        if (marks.size() == 0){
            average = 0.0;
        } else {
            for (Mark mark : marks) {
                average += mark.getMarkType().getValue();
            }
            average /= marks.size();
        }
        int cut = (int) (100 * average);
        average = cut / 100.0;
        return average;
    }

    public double calculateSubjectAverage(Subject subject){
        double average = 0.0;
        int elements = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())){
                average += mark.getMarkType().getValue();
                elements++;
            }
        }
        if (elements == 0){
            average = 0.0;
        } else {
            average /= elements;
        }
        int cut = (int) (100 * average);
        average = cut / 100.0;
        return average;
    }

    public void grading(Mark mark){
        if (mark == null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    @Override
    public String toString() {
        String text = name + " marks:";
        for (Mark mark: marks) {
            text += " " + mark.getSubject().getSubjectName() + ": " + mark.toString();
        }
        return text;
    }

    private boolean isEmpty(String string) {
        return string == null || string.isBlank();
    }


}
