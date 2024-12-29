package hw_191224.Task;

import java.util.ArrayList;

public class Order {
    int id;
    Customer customer = new Customer();
    static ArrayList<Product> productList = new ArrayList<>();
    double totalAmount = contTotalPriceOrderList(productList);

// *    - id (уникальный идентификатор заказа, тип int)
// *    - customer (объект класса Customer)
// *    - productList (список продуктов, тип List<Product>)
// *    - totalAmount (общая сумма заказа, тип double)


    public Order(int id, Customer customer, double totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    // метод подсчета суммы заказа из списка:
    public double contTotalPriceOrderList(ArrayList<Product> prod){
        double totalPrice = 0;
        for (int i = 0; i < prod.size(); i++) {
            totalPrice = totalPrice + prod.get(i).price;
        }
        return totalPrice;
    }

// метод подсчета суммы заказа из массива:
    public double contTotalPriceOrder(Product[] prod){
        double totalPrice = 0;
        for (int i = 0; i < prod.length; i++)
        {
            totalPrice = totalPrice + prod[i].price;
        }
        return totalPrice;
    }

    public Order() {
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
}
