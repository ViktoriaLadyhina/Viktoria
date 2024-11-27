package Summary1;

public class Summary {

    public static void main(String[] args) {
// ---------- Про котов (Классы и объекты)
        Cat vasya = new Cat(); // Класс Cat создан в отдельном файле
        vasya.name = "Вася";
        vasya.age = 10;
        // Cat - это класс, vasya - это объект

        Cat murzik = new Cat();

        System.out.println(vasya.name);
        System.out.println(vasya.age);
        System.out.println(murzik.name);
        System.out.println(murzik.age);

//        System.out.println("Котов всего " + Cat.count);

// Вынесение в метод - ctrl+Alt+M

// ----- Математические коды --------
            Calculator calculator = new Calculator(); // в отдельном файле
            int a = 10;
            int b = 20;
            calculator.printAllCalculate(a, b);

            a = 20;
            b = 40;
            calculator.printAllCalculate(a, b);
            System.out.println("Calculator a имеет значение " + calculator.a); // 0, потому что нет значение

        String name = "Иван";
        hello(name);
            name = "Евгений";
            hello(name);

// Homework 2
            int num = 1234;
            int a1 = num/1000; // 1
            int b1 = num % 1000/100; // 2
            int c = num % 100 / 10; // 3
            int d = num % 10; // 4
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c);
        System.out.println(d);

    }

    private static void hello(String name) {
        System.out.println("Привет " + name);
    }
}