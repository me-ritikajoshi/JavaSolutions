package JavaConcepts;

public class EmployeeClass {
    private String name;
    private int salary;

    public EmployeeClass() {

    }

    public EmployeeClass(String n, int s) {
        name = n;
        salary = s;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public String getName() {
        return "My name is " + name;
    }

    public int getSalary() {
        return salary;
    }

}