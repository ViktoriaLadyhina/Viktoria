package hw_121224;

public class Company {
    private String name;
    private String address;
    private String CEO;
    private static Department[] departments;

    public Company(String name, String address, String CEO, Department[] departments) {
        this.name = name;
        this.address = address;
        this.CEO = CEO;
        this.departments = departments;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public void printEmployeesSalary(double salaryEmpl) {
        for (int i = 0; i < departments.length; i++) {
            Employee[] employees = departments[i].getEmployees();
            for (int j = 0; j < employees.length; j++) {
                if (employees[j].getSalary() > salaryEmpl) {
                    System.out.print(employees[j].getName() + ", ");
                }
            }
        }
    }


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getCEO() { return CEO; }

    public void setCEO(String CEO) { this.CEO = CEO; }

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Tom", true, "Developer", 6000);
        Employee emp2 = new Employee(2, "Olga", false, "Manager", 3800);
        Employee emp3 = new Employee(3, "Rita", false, "Accountant", 4800);
        Employee emp4 = new Employee(4, "Alex", true, "Developer", 5500);
        Employee[] arrEmployees = {emp1, emp2, emp3, emp4};

        Department department = new Department(1, "IT", 4, arrEmployees);
        Department[] arrDepartments = {department};

        Company company = new Company("LLL", "London", "John", arrDepartments);


        System.out.print("Сотрудники, у которых зарплата больше, чем 5000: ");
        company.printEmployeesSalary(5000);

    }
}
