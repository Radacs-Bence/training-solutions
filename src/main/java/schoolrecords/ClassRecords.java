package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student){
        boolean isNew = true;
        for (Student classmate: students) {
            if (classmate.getName().equals(student.getName())){
                isNew = false;
            }
        }
        if (isNew){
            students.add(student);
        }
        return isNew;
    }

    public boolean removeStudent (Student student){
        boolean isOlD = false;
        List<Student> studentsToDelete = new ArrayList<>();
        for (Student classmate: students) {
            if (classmate.getName().equals(student.getName())){
                isOlD = true;
                studentsToDelete.add(classmate);
            }
        }
        students.removeAll(studentsToDelete);
        return isOlD;
    }

    public double calculateClassAverage(){
        if (students.size() == 0){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double average = 0.0;
        for (Student student: students) {
            if (student.calculateAverage() == 0.0){
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            average += student.calculateAverage();
        }
        average /= students.size();
        int cut = (int) (100 * average);
        average = cut / 100.0;
        return average;
    }

    public double calculateClassAverageBySubject(Subject subject){
        if (students.size() == 0){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double average = 0.0;
        int counter = 0;
        for (Student student: students) {
            if (student.calculateAverage() == 0.0){
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            if (student.calculateSubjectAverage(subject) != 0) {
                average += student.calculateSubjectAverage(subject);
                counter++;
            }
        }
        average /= counter;
        int cut = (int) (100 * average);
        average = cut / 100.0;
        return average;
    }

    public Student findStudentByName(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0){
            throw new IllegalStateException("No students to search!");
        }
        for (Student classmate: students) {
            if (classmate.getName().equals(name)){
                return classmate;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition(){
        if (students.size() == 0.0){
            throw new IllegalStateException("No students to select for repetition!");
        }
        int number = rnd.nextInt(students.size());
        return students.get(number);
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> studyResults = new ArrayList<>();
        for (Student student: students) {
            StudyResultByName studyResultByName = new StudyResultByName(student.getName(), student.calculateAverage());
            studyResults.add(studyResultByName);
        }
        return studyResults;
    }

    public String listStudentNames(){
        String text = "";
        for (Student student: students) {
            if (students.indexOf(student) != 0){
                text += ", ";
            }
            text += student.getName();
        }
        return text;
    }
}
