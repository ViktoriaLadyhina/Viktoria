package lesson5;

public class Test {

    public static void main(String[] args) {
        Cat kitty = new Cat(8, "Labrik"); // серым сам добавляет, прописывать не надо или выдает ошибку
        Cat cat = new Cat("testName");
        Cat testCat = new Cat();

        System.out.println(kitty);

    }
}

