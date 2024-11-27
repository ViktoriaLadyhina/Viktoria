import lesson3.Lesson3;
import java.util.Scanner;

public class Test {
//    public static void main(String[] args) {

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

//        int numb1 = 3; // целое число от -2147483648 до 2147483647 (32 бита = 4 байта)
//        short numb2 = 2; // целое число от -32768 до 32767 (16 бит)
//        byte numb3 = 1; // целое число от -128 до 127 (8 бит = 1 байт)
//        long numb4 = 4; // целое число от -9223372036854775808 до 9223372036854775807 (64 бита)
//        float numb5 = 5,1F; // от (2 в степени -149) до ((2-2 в степени -23)*2 в степени 127) (32 бита)
//        double numb6 = 6,12; // от (-2 в степени 63) до ((2 в степени 63)-1) (64 бита)
//        char symbol = 's'; // символ от 0 до 65536, может быть буква (16 бит = 2 байта)

//        System.out.println(numb1 + numb2 + numb3 + numb4 + numb5 + numb6);
//        System.out.println(numb5 + numb6);
//        System.out.println(symbol);

// ------------- 20.11.2024 (lesson 3)-----------------

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

// ------------------Задачи--------------------

//        Scanner scanner = new Scanner(System.in);
//        Lesson3 lesson3 = new Lesson3();

        // Задача 1. Считать два числа из консоли, и сложить их и вывести результат
//        System.out.println("Напиши первое число");
//        int number1 = scanner.nextInt();
//        System.out.println("Напиши второе число");
//        int number2 = scanner.nextInt();
//        System.out.println(number1 + number2);

// Задача 2. Считать два числа из консоли в переменной экземпляре класса и вывести результат их сложения
          // System.out.println("Напиши первое число");
          // lesson3.number1 = scanner.nextInt();
          // System.out.println("Напиши второе число");
          // lesson3.number2 = scanner.nextInt();
          // System.out.println(lesson3.number1 + lesson3.number2);

// ------------- 25.11.2024 (lesson 5) -----------------

// ----------------- Системы исчисления---------------
// Позиционная система исчисления - десятичное
// непозиционная система исчисления - неудобная
// двоичная - дискретная математика, информатика, программирование
// бинарная система - 2 цифры 0 или 1 - это / бит или 1 байт
// Группы из 8 бит соответствует десятичны = 0, 1, ..., 255 значений

// шестнадцатеричная - тоже в программировании - Hex, подсчитывает время
// числа - 1, 2, 3, 4, 5, 6, 7, 8, 9, А-10, В-11, С-12, D-13, E-14, F-15

// перевод происходит через деление и умножение

// ------------- Задача по переводу------------

// Можно переводить через браузер
// переводим число 26
// 26 - десятичная система
// 26 делим в столбик на самое большое число в степени 2, которое доходит до нашей 26, это - 16
// 26 / 16 = 1 и остаток 10
// дальше делим на 8, ... в итоге 11010
// умножение - 16*1+8*1...

// ------------- 27.11.2024 (lesson 5) -----------------

        public static void findEvenOdd(int num)  {
            if (num / 2 == 0) {
                System.out.println(num+" is even"); }
            else  {
                System.out.println(num+" is odd");  }
        }
        public static void main (String[] args)  {
            findEvenOdd(2);
            findEvenOdd(4);
            findEvenOdd(5);
        }





    }




