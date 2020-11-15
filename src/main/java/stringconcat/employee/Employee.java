package stringconcat.employee;

public class Employee {

    String name;
    String job;
    int pay;

    public Employee(String name, String job, int pay) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        if (job == null || job.isEmpty()){
            throw new IllegalArgumentException("Job must not be empty.");
        }
        this.job = job;
        if (pay <= 0 || pay % 1000 != 0){
            throw new IllegalArgumentException("Salary must be positive.");
        }
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return pay;
    }

    @Override
    public String toString() {
        return name + " - " + job + " - " + Integer.toString(pay) + " Ft";
    }
}
