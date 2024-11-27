package Homework6;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        Math6 metod = new Math6();
// №1
// Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
// Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
// Например:
// ввод - mama, papa
// вывод - mapa
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово");
        String word1 = scanner.nextLine();

        System.out.println("Введите второе слово");
        String word2 = scanner.nextLine();

        if (metod.isEvenLength(word1) && metod.isEvenLength(word2)) {
            String combinedWord = metod.combineWords(word1,word2);
            System.out.println(combinedWord);
        } else {
            System.out.println("Одно или оба слова не имеют четное количество букв.");
        }

        scanner.close();



// №2
// Реализовать программу, выводящую на экран результаты:

// -Сложения двух чисел
        metod.getSum(10, 4);
// -Вычитания двух чисел
        metod.getSub(10, 4);
// -Умножения двух чисел
        metod.getMul(10, 4);
// -Деления двух чисел
        metod.getDiv(10, 4);
//    Каждая из арифметических операций должна быть реализована как отдельный метод.



    }
}