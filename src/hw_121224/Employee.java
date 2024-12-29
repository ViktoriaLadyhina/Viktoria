package hw_121224;

public class Employee {
    private int id;
    private String name;
    private boolean gender;
    private String position;
    private double salary;

    public Employee(int id, String name, boolean gender, String position, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", gender=" + gender + ", position='" + position + '\'' + ", salary=" + salary + '}';
    }
}
