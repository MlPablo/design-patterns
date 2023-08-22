package task_3_1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {
    private final List<Employee> employees;
    private int position;

    public StaffListIterator(List<Employee> employees) {
        this.employees = employees;
        this.employees.sort(Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER));
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < employees.size();
    }

    @Override
    public Employee next() {
        if (hasNext()) {
            return employees.get(position++);
        }
        return null;
    }
}
