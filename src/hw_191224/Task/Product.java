package hw_191224.Task;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private boolean inStock; // наличие на складе
    private Category category; // с условия задачи 2 класса Е3
    private double discount; // с условия задачи 2 класса Е3


    public Product() {
    }

    public Product(int id, String name, double price, String description, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
    }

    // Конструктор с параметрами с условия задачи 2 класса Е3
    public Product(int id, String name, double price, String description, boolean inStock, Category category, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
        this.category = category;
        this.discount = discount;
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

    // с условия задачи 2 класса Е3:

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    //метод, который возвращает цену продукта с учётом скидки
    public double calculateFinalPrice() {
        return price - (price * discount / 100);
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", description='" + description + '\'' + ", inStock=" + inStock + ", category=" + category + ", discount=" + discount + '}';
    }
}
