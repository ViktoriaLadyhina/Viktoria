package lesson6;

public class Dog {

    private int age; // private - по умолчанию и поля должны быть private
    private String name;

// get - возьми
// set - вставь

    public int getAge() {
        return age;
    }
    public void setAge(int age) { this.age = age; }
    public String getName() { return name;  }
    public void setName(String name) { this.name = name; }

// -------------  Задачи -----------
// Создайте метод getSum(int a, int b), который возвращает инт число, и печатает результат суммы двух полученных чисел в консоль.
// вызов происходит в классе Lesson6
    public int getSum(int a, int b) {
        return a + b;
    }
}
