package task_3_1;

public class Manager implements Employee {

    private final String name;
    private final int salary;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void payExpenses() {
        System.out.println(name + " has been paid $" + salary);
    }

}
