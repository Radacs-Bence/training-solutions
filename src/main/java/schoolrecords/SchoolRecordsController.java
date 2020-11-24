package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private  ClassRecords classRecords;
    private List<Tutor> tutors;
    private List<Subject> subjects;

    public void initSchool(){
        classRecords = new ClassRecords("7.a", new Random());
        Subject math = new Subject("Matematika");
        Subject pe = new Subject("Testnevelés");
        Subject computerSciences = new Subject("Informatika");
        Subject history = new Subject("Történelem");
        Subject literature = new Subject("Irodalom");
        Tutor teacherFirst = new Tutor("Gipsz Jakab", Arrays.asList(math, computerSciences));
        Tutor teacherSecond = new Tutor("Gipsz Jónás", Arrays.asList(history, literature));
        Tutor teacherThird = new Tutor("Kiss Piroska", Arrays.asList(pe));
        tutors = Arrays.asList(teacherFirst, teacherSecond, teacherThird);
        subjects = Arrays.asList(math, pe, computerSciences, history, literature);
    }

    public ClassRecords getClassRecords() {
        return classRecords;
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    private void printMenu(){
        System.out.println("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                "6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Kilépés");
    }

    private boolean navigateMenu(String button){
        boolean run = true;
        switch (button){
            case "1":
                System.out.println(classRecords.listStudentNames());
                break;
            case "2":
                System.out.println(searchStudent());
                break;
            case "3":
                addStudent();
                break;
            case "4":
                deleteStudent();
                break;
            case "5":
                repeatStudent();
                break;
            case "6":
                System.out.println("Osztályátlag: " + classRecords.calculateClassAverage());
                break;
            case "7":
                subjectAverage();
                break;
            case "8":
                studyResultList();
                break;
            case "9":
                double average = searchStudent().calculateAverage();
                System.out.println("Tanuló átlaga: " + average);
                break;
            case"10":
                studentAverageBySubject();
                break;
            case "11":
                run = false;
                break;
            default:
                System.out.println("Nincs ilyen menü opció: " + button);
        }
        return run;

    }

    private Student searchStudent(){
        Student student = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Keresett név:");
        String name = scanner.nextLine();
        try {
            student = classRecords.findStudentByName(name);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage() + "\n"
                    + "Próbálja újra!");
        }
        return student;
    }

    private void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Új diák neve:");
        String name = scanner.nextLine();
        boolean success = classRecords.addStudent(new Student(name));
        if (success){
            System.out.println("Diák létrehozva!");
        } else{
            System.out.println("Ilyen nevű diák már létezik!");
        }
    }

    private void deleteStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Törlendő diák neve:");
        String name = scanner.nextLine();
        Student student = null;
        try {
            student = classRecords.findStudentByName(name);
            classRecords.removeStudent(student);
            System.out.println("Diák törölve!");
        } catch (IllegalArgumentException ex) {
            System.out.println("Ilyen nevű diák nem létezik!");
        }
    }

    private void repeatStudent(){
        Scanner scanner = new Scanner(System.in);
        Student selected = classRecords.repetition();
        boolean success = false;
        while (!success){
            System.out.println(selected + "\n" +
                    "Adja meg a jegyet:");
            int markNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Jegyet adó oktató neve:");
            String nameOfTutor = scanner.nextLine();
            System.out.println("Tantárgy neve:");
            String nameOfSubject = scanner.nextLine();
            MarkType markType = null;
            Tutor tutor = null;
            Subject subject = null;
            for (int i = 0; i < MarkType.values().length; i++) {
                if (markType.values()[i].getValue() == markNumber) {
                    markType = markType.values()[i];
                }
            }
            for (Tutor tutorsItem : tutors) {
                if (tutorsItem.getName().equals(nameOfTutor)) {
                    tutor = tutorsItem;
                }
            }
            for (Subject subjectItem : subjects) {
                if (subjectItem.getSubjectName().equals(nameOfSubject)) {
                    subject = subjectItem;
                }
            }
            if (markType == null || subject == null || tutor == null) {
                System.out.println("Megadott adatok nem érvényesek: " + markNumber + " " + nameOfTutor + " " + nameOfSubject);
            } else if (tutor.tutorTeachingSubject(subject)){
                selected.grading(new Mark(markType, subject, tutor));
                success = true;
            } else {
                System.out.println(tutor.getName() +  " nem tanítja ezt a tárgyat: " + subject.getSubjectName());
            }
        }
    }

    public void subjectAverage(){
        boolean success = false;
        Subject subject = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Keresett tantárgy:");
        String name = scanner.nextLine();
        for (Subject subjectItem : subjects) {
            if (subjectItem.getSubjectName().equals(name)) {
                subject = subjectItem;
                success = true;
            }
        }
        if (subject == null){
            System.out.println("Ilyen tantárgy nincs: " + name);
        } else {
            System.out.println(subject.getSubjectName() + " átlag:" + classRecords.calculateClassAverageBySubject(subject));
        }
    }

    public void studyResultList(){
        List<StudyResultByName> studyResults = classRecords.listStudyResults();
        for (StudyResultByName studyResultByName: studyResults) {
            System.out.println(studyResultByName.getStudentName() + ": (" + studyResultByName.getStudyAverage() + ")");
        }
    }

    public void studentAverageBySubject(){
        Student student = searchStudent();
        Subject subject = null;
        if (student != null){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Keresett tantárgy:");
            String name = scanner.nextLine();
            for (Subject subjectItem : subjects) {
                if (subjectItem.getSubjectName().equals(name)) {
                    subject = subjectItem;
                }
            }
            if (subject == null) {
                System.out.println("Ilyen tantárgy nincs: " + name);
            }
            double average = student.calculateSubjectAverage(subject);
            System.out.println(student.getName() + " " + subject.getSubjectName() + " átlagaga : (" + average + ")");
        }
    }

    public void runMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            printMenu();
            String button = scanner.nextLine();
            button = button.trim();
            run = navigateMenu(button);
            System.out.println("Nyomjon entert a folytatáshoz!");
            scanner.nextLine();
        }
    }


    public static void main(String[] args) {
        SchoolRecordsController controller = new SchoolRecordsController();

        controller.initSchool();
        controller.runMenu();

    }
}
