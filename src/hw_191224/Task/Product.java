package hw_191224.Task;

import hw_191224.TaskE3.Category;

public class Product {
    int id;
    String name;
    double price;
    String description;
    boolean inStock; // наличие на складе

    public Product() {
    }

    public Product(int id, String name, double price, String description, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", inStock=" + inStock +
                '}';
    }

// с условия задачи 2 класса Е3:

    Category category = new Category();
    double discount;

    public double calculateFinalPrice(double price, double discount) {
        double totalPrice = price - discount;
        return totalPrice;
    }
}
