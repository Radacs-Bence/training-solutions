package week12d05;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFilter {

    public List<Employee> countSeniorDevs(List<Employee> employees) {
        listChecker(employees);
        List<Employee> seniors = new ArrayList<>();
        for (Employee employee : employees) {
            listChecker(employee.getSkills());
            if (employee.getSkillLevel() >= 3 && employee.getSkills().contains("programming")){
                seniors.add(employee);
            }
        }
        return seniors;
    }

    private void listChecker(List listToCheck){
        if (listToCheck == null || listToCheck.isEmpty()){
            throw new IllegalArgumentException();
        }
    }

}
