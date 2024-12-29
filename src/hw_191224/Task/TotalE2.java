package hw_191224.Task;

import java.util.ArrayList;

public class TotalE2 {
    public static void main(String[] args) {
        Order order = new Order();
        Product product1 = new Product(1, "Bread", 1.15, "bread products", true);
        Product product2 = new Product(2, "Milk", 1.05, "dairy products", true);
        Product product3 = new Product(3, "Coffee", 6, "drinks", true);
        Product product4 = new Product(4, "Tee", 2.6, "drinks", true);
        Product product5 = new Product();
            product5.setId(5);
            product5.setName("Cookie");
            product5.setPrice(1.4);
            product5.setDescription("bread products");
            product5.setInStock(false);

// Вывод общей суммы заказа из массива:
        Product[] prodArr = {product1, product2, product3, product4, product5};
        double sumOrderArray = order.contTotalPriceOrder(prodArr);
        System.out.println("Вывод общей суммы заказа из массива: " + sumOrderArray);

// Вывод общей суммы заказа из списка:
        ArrayList<Product> prodList = new ArrayList<>();
            prodList.add(product1);
            prodList.add(product2);
            prodList.add(product3);

        double sumOrderList = order.contTotalPriceOrderList(prodList);
        System.out.println("Вывод общей суммы заказа из списка: " + sumOrderList);

        Customer customer1 = new Customer(1, "Valera", "Volk", "volk@gmail.com", "017542819");
        Customer customer2 = new Customer(2, "Olga", "Yakimchuk", "Yakim@gmail.com", "017423654");
        Customer customer3 = new Customer();
            customer3.setId(3);
            customer3.setFirstName("Alex");
            customer3.setLastName("Polov");
            customer3.setEmail("polov@gmail.com");
            customer3.setPhoneNumber("017459582");

        Order order1 = new Order();
            order1.setId(1);
            order1.setCustomer(customer2);
            order1.setTotalAmount(2);

        Order order2 = new Order();
        Order order3 = new Order();

// Проверка методов класса Product:
        System.out.println("-------------------");
        System.out.println(product1);
        System.out.println("getId: " + product1.getId());
        System.out.println("getName: " + product1.getName());
        System.out.println("getPrice: " + product1.getPrice());
        System.out.println("getDescription: " + product1.getDescription());
        System.out.println("isInStock: " + product1.isInStock());

// Проверка методов класса Customer:
        System.out.println("-------------------");
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println("getId: " + customer1.getId());
        System.out.println("getFirstName: " + customer1.getFirstName());
        System.out.println("getLastName: " + customer1.getLastName());
        System.out.println("getEmail: " + customer1.getEmail());
        System.out.println("getPhoneNumber: " + customer1.getPhoneNumber());

// Проверка методов класса Order:
        System.out.println("-------------------");
        System.out.println("getId: " + order1.getId());
        System.out.println("объект класса Customer: " + order1.getCustomer());
        System.out.println("getTotalAmount: " + order1.getTotalAmount());

    }
}
