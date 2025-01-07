package hw_191224.Task;

public class TotalE4 {
    public static void main(String[] args) {

        Person anja = new Person(1, "Anna", "anna@gmail.com");
        Person igor = new Person(2, "Igor", "igor@gmail.com");

        Employee employee = new Employee(3, "Olga", "olga@gmail.com", "frontend", 2400.00);

        Manager manager = new Manager(4, "Oleg", "oleg@gmail.com", "manager", 3000, 5, 0.5);

        System.out.println(anja);
        System.out.println(igor);
        System.out.println(employee);
        System.out.println(manager);
    }

}
