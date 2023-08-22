package task_3_1;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Employee {

    private final List<Employee> employees = new ArrayList<>();

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void payExpenses() {
        for (Employee employee : employees) {
            employee.payExpenses();
        }
    }

}
