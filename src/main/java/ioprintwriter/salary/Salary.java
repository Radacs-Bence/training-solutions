package ioprintwriter.salary;

public enum Salary {

    OTHER(100000, ""), DR(500000, "Dr"), MRS(200000, "Mrs"), MR(200000, "Mr");

    private int salary;
    private String title;

    Salary(int salary, String title) {
        this.salary = salary;
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }
}
