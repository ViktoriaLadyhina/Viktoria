package hw_121224;

public class Department {
    private int id;
    private String name;
    private int countEmp;


    private Employee[] employees;


    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
