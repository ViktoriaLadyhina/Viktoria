package hw_191224.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private ArrayList<Product> productList;
    private double totalAmount;

    private OrderStatus status; // с условия задачи 6 класса Е3
    private LocalDate orderDate; // с условия задачи 6 класса Е3

    public Order() {
    }

    public Order(int id, Customer customer, double totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    // Конструктор с параметрами с условия задачи 6 класса Е3
    public Order(int id, Customer customer, ArrayList<Product> productList, double totalAmount, OrderStatus status, LocalDate orderDate) {
        this.id = id;
        this.customer = customer;
        this.productList = productList;
        this.totalAmount = totalAmount;
        this.status = status;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = (ArrayList<Product>) productList;

    }

// метод подсчета суммы заказа из списка:
    public double contTotalPriceOrderList(ArrayList<Product> prod){
        double totalPrice = 0;
        for (int i = 0; i < prod.size(); i++) {
            totalPrice = totalPrice + prod.get(i).getPrice();
        }
        return totalPrice;
    }

// метод подсчета суммы заказа из массива:
    public double contTotalPriceOrder(Product[] prod){
        double totalPrice = 0;
        for (int i = 0; i < prod.length; i++) {
            totalPrice = totalPrice + prod[i].getPrice();
        }
        return totalPrice;
    }

    // метод, который пересчитывает общую сумму заказа с учётом скидок на продукты с условия задачи 6 класса Е3:

    public double calculateTotalAmount(ArrayList<Product> prod){
        double totalAmount = 0;

        for (int i = 0; i < prod.size(); i++) {
            totalAmount = totalAmount + prod.get(i).calculateFinalPrice();
        }
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id + ", " +
                "customer=" + customer + ", " +
                "productList=" + productList + ", " +
                "totalAmount=" + totalAmount + ", " +
                "status=" + status + ", " +
                "orderDate=" + orderDate + '}';
    }
}

