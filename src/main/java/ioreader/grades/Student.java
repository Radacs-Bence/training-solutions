package ioreader.grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> gradeList;


    public Student(String name, List<Integer> gradeList) {
        this.name = name;
        this.gradeList = gradeList;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(gradeList);
    }

    public double average() {
        double sum = 0;
        for (Integer i : gradeList) {
            sum += i;
        }

        return sum / gradeList.size();
    }

    public boolean isIncreasing() {
        boolean increasing = true;
        int previousGrade = 0;
        for (int grade : gradeList) {
            if (grade < previousGrade){
                increasing = false;
            }
            previousGrade = grade;
        }
        return increasing;
    }
}
