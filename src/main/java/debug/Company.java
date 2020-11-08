package debug;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Employee findEmployeeByName(String name){
        Employee foundEmployee = null;
        for (Employee item: employees) {
            if (item.getName().equals(name)){
                foundEmployee = item;
            }
        }
        return foundEmployee;
    }

    public List<String> listEmployeeNames(){
        List<String> listEmployeeNames = new ArrayList<>();
        for (Employee item: employees) {
                listEmployeeNames.add(item.getName());

        }
        return listEmployeeNames;
    }


}
