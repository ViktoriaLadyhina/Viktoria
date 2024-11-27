package lesson6;
import java.util.Random;

public class Lesson6 {
// модификаторы доступа: public, private, protected

// void - возвращаемое значение, если метод ничего не передает

    public static void main(String[] args) {

        Dog dog = new Dog(); // объявление объекта про собаку
        dog.setName("Альфа");
        dog.setAge(5);
        System.out.println("15 строка - " + dog.getName());
        System.out.println("16 строка - " + dog.getAge());

// -------------  Задачи -----------

// Создайте метод getSum(int a, int b), который возвращает инт число, и печатает результат суммы двух полученных чисел в консоль.
// метод был создан в Dog.java, потому что там идет функционал нашего урока
        int dogSum = dog.getSum(10, 3456789);
        System.out.println("23 строка - " + dogSum);// вызов метода с параметрами

// --------------- Random - случайные числа ----------
//Использование Random класса:
//1. Импортировать класс java.util.Random
//2. Создать экземпляр класса Random (Random rand = new Random())
        Random rand = new Random(); // импортирует автоматически (добавляет вверху строчку)
//3. Вызовите один из следующих методов объекта rand:
//3.1. nextInt(upperbound) генерирует случайные числа в диапазоне от 0 до upper bound -1.
        System.out.println("32 строка - " + "int " + rand.nextInt());
//3.2. nextFloat() генерирует число с плавающей запятой от 0,0 до 1,0.
        System.out.println("34 строка - " + "Float " + rand.nextFloat());
//3.3. nextDouble() генерирует двойное число между 0.0 и 1.0.
        System.out.println("36 строка - " + "Double " + rand.nextDouble());

        System.out.println("38 строка - " + rand.nextInt(-234, 35));

//-----------Math - для роботы с числами ---------
        System.out.println("41 строка - " + Math.random());// также вывести рандомное число

        int randNumber = rand.nextInt();
        System.out.println("44 строка - " + rand.nextInt() + " " + randNumber);

        int numb1 = rand.nextInt(1, 100);
        int numb2 = rand.nextInt(1, 100);
        System.out.println("48 строка - " + dog.getSum(numb2, numb2));
    }
}
