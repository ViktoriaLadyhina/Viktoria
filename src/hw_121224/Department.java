package hw_121224;

public class Department {
    private int id;
    private String name;
    private int countEmp;
    private Employee[] employees;

    public Department(int id, String name, int countEmp, Employee[] employees) {
        this.id = id;
        this.name = name;
        this.countEmp = countEmp;
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountEmp() {
        return countEmp;
    }

    public void setCountEmp(int countEmp) {
        this.countEmp = countEmp;
    }

}
