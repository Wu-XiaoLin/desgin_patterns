package composite.base;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String dept;
    private Double slary;
    private List<Employee> subordinates = new ArrayList<Employee>();;

    public Employee() {
    }

    public Employee(String name, String dept, Double slary) {
        this.name = name;
        this.dept = dept;
        this.slary = slary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSlary() {
        return slary;
    }

    public void setSlary(Double slary) {
        this.slary = slary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", slary=" + slary + '}';
    }

}
