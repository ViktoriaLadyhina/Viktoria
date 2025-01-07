package hw_191224.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TotalE3 {
    public static void main(String[] args) {

    Category dishes = new Category(1, "dishes", "plates and cups");
    Category electricalAppliances = new Category(2, "electricalAppliances", "electricalAppliances");
    Category furniture = new Category(3, "furniture", "furniture");

    Address address1 = new Address("Lushpy", "Sumy", "40035", "Ukraine");
    Address address2 = new Address("Burgstr", "Cologne", "51145", "Germany");

    Product tv = new Product(6, "Sony", 450.00, "LCD", true, electricalAppliances, 2);
    Product mobilePhone = new Product(7, "Samsung", 650.00, "", true, electricalAppliances, 0);
    Product teaService = new Product(8, "classical", 85.00, "porcelain", true, dishes, 15);

    Customer ivan = new Customer(4, "Ivan", "Akimenko", "Akimenko@gmail.com", "123-456-789", address1);
    Customer nadja = new Customer(4, "Nadezhda", "Borischenko", "Borischenko@gmail.com", "123-456-789", address2);

    OrderStatus status = new OrderStatus(1, "Processing", LocalDate.now());

    ArrayList<Product> products = new ArrayList<>();
    products.add(tv);
    products.add(mobilePhone);
    products.add(teaService);

    ArrayList<Product> products2 = new ArrayList<>();
    products2.add(teaService);

    Order order = new Order();
    double total = order.calculateTotalAmount(products);

    Order order2 = new Order(2, ivan, products, total, status, LocalDate.now());
    System.out.println(order2);
    System.out.println("Финальная стоимость заказа с учетом скидок - " + total);
    System.out.println("Статус - " + status);
    System.out.println("Адрес - " + address1);

    System.out.println("----------- Второй заказ----------");
    double total2 = order.calculateTotalAmount(products2);
    Order order3 = new Order(3, nadja, products2, total2, status, LocalDate.now());
    System.out.println(order3);
        System.out.println("Финальная стоимость заказа с учетом скидок - " + total2);
        System.out.println("Статус - " + status);
        System.out.println("Адрес - " + address2);

// Реализуйте сценарий, где создаётся заказ с несколькими продуктами, устанавливается статус, добавляются адреса клиента.
// Выведите в консоль подробную информацию о заказе, включая финальную стоимость и статус.
    }
}
