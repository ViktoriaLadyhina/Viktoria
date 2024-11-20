import Lesson3.Lesson3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        int x = 4 + 5;
//        int y = 5 - 4;
//        double d = (double) 6 / 5; // будет дробная часть
//        int d2 = 6 / 5; // не будет дробной части
//        int umn = 5 * 5;
//        int division = 7 % 5;


//        int x = 168;
//        int y = 1500;
//
//        int sum = x + y;
//        int multi = x * y;
//        int difference = x - y;
//        double division = (double) x / y;
//        int rest = x % y;
//
//        System.out.println(sum); // 1668
//        System.out.println(multi); // 252000
//        System.out.println(difference); // -1332
//        System.out.println(division); // 0.112
//        System.out.println(rest); // 168

        // В методе main инициализировать все примитивные типы. Выведите в консоль char и сумму сложение всех численных переменных

//        int numb1 = 50; // целое число от -2147483648 до 2147483647 (32 бита)
//        short numb2 = 15; // целое число от -32768 до 32767 (16 бит)
//        byte numb3 = 5; // целое число от -128 до 127 (8 бит)
//        long numb4 = 522678; // целое число от -9223372036854775808 до 9223372036854775807 (64 бита)
//        float numb5 = 5.2F; // от (2 в степени -149) до ((2-2 в степени -23)*2 в степени 127) (32 бита)
//        double numb6 = 5.21; // от (-2 в степени 63) до ((2 в степени 63)-1) (64 бита)
//        char symbol = 's'; // символ от 0 до 65536, может быть буква (16 бит)

//        System.out.println(numb1 + numb2 + numb3 + numb4 + numb5 + numb6);
//        System.out.println(numb5 + numb6);
//        System.out.println(symbol);

        // ------------- 20.11.2024-----------------

        // lesson3.nonStaticNum = 8; // дали значение переменной с lesson3

        // lesson3.method(); // вызвали метод с lesson3

        // System.out.println(lesson3.nonStaticNum); // показали в консоль значение переменной экземпляра из объекта (поэтому с маленькой буквы)
        // System.out.println(Lesson3.number); // показали в консоль значение СТАТИЧЕСКОЙ переменной класса (поэтому с большой буквы)

        // ----------------СКАНЕР----------------

//        Scanner scanner = new Scanner(System.in); // Создали сканер в скобках - консоль внутрь, теперь можем считывать переменные с консоли
//        Lesson3 lesson3 = new Lesson3(); // создали объект
//        System.out.println("Напиши число");
//        lesson3.nonStaticNum = scanner.nextInt();
//
//        System.out.println(lesson3.nonStaticNum);

        //------------------Задачи--------------------

        Scanner scanner = new Scanner(System.in);
        Lesson3 lesson3 = new Lesson3();

        // Задача 1. Считать два числа из консоли, и сложить их и вывести результат
//        System.out.println("Напиши первое число");
//        int number1 = scanner.nextInt();
//        System.out.println("Напиши второе число");
//        int number2 = scanner.nextInt();
//        System.out.println(number1 + number2);

        // Задача 2. Считать два числа из консоли в переменной экземпляре класса и вывести результат их сложения
          System.out.println("Напиши первое число");
          lesson3.number1 = scanner.nextInt();
          System.out.println("Напиши второе число");
          lesson3.number2 = scanner.nextInt();
          System.out.println(lesson3.number1 + lesson3.number2);

    }
}



