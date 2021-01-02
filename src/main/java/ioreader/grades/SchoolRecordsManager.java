package ioreader.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class SchoolRecordsManager {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void readGradesFromFile(String fileName) {
        Path file = Path.of("src/main/resources/" + fileName);
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                studentMakerFromLine(line);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
    }

    private void studentMakerFromLine (String line){
        String[] parts = line.split(" ");
        String name = parts[0];
        List<Integer> grades = new ArrayList<>();
        for (String grade : parts) {
            if (!grade.equals(name)){
                grades.add(Integer.parseInt(grade));
            }
        }
        students.add(new Student(name, grades));
    }

    public double classAverage() {
        double sum=0;
        for(Student student: students){
            sum+=student.average();
        }
        return sum/students.size();

    }
}
