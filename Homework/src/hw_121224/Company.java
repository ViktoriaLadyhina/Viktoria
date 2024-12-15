package hw_121224;

public class Company {
    private int id;
    private String name;
    private String address;

    private Department[] departments;



    public void sal(Company company, Employee employee){
        Department[] departments = company.departments;
        employee.setSalary(3400);



    }

    public void getDepartments() {
    }

    public void setDepartments(Department[] departments) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
