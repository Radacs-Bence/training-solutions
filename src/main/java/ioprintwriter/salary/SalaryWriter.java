package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {

    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    public void writeNamesAndSalaries(Path file) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String name : names) {
                int salary = salaryFinder(name);
                writer.print(name);
                writer.print(": ");
                writer.println(salary);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not open file!", ioException);
        }
    }

    private int salaryFinder(String name) {
        int money = 0;
        for (Salary salary : Salary.values()) {
            if (name.indexOf(salary.getTitle()) == 0){
                money = salary.getSalary();
            }
        }
        return money;
    }

}
