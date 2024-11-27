package lesson7;

import java.util.Random;

public class Lesson7 {
    public static void main(String[] args) {
Metod metod = new Metod();

// ------------------ Задачи ---------------
// Задача Выбор случайного студента для вопроса:
// Напишите метод, который принимает на вход количество студентов и “рандомально” выбирает любого студента начиная со второго включительно.
// Например: в зуум сейчас присутствуют 10 участников. Первый участник - это преподаватель. Выбор должен быть сделан из 9 последующих, т.е. число выбирается из диапазона 2-10.
        System.out.println(metod.getRandomStudent(24));

// Задача 2
// Напишите программу для того, чтобы поменять местами значения, хранящиеся в двух переменных с помощью третьей переменной:
// На вход: а = 2; b = 5;
// На выход: a = 5; b = 2;
        System.out.println("Значение до метода a = 2, b = 5");
        System.out.println("Значение после метода замены а и b местами");
        metod.get(2, 5);

// Задача 3
// Напишите класс Converter для конвертации из градусов по Цельсию в Кельвины​, ​Фаренгейты:
// У класса должны быть методы для конвертации.
// Реализуйте два метода в классе:
// runKelvinConverter(double baseValue)
// runFahrenheitConverter(double baseValue)
//        You 13:22
//        Формула для фаренгейта из цельсия
//                F = (C × 1.8) + 32
//        Формула для кевинов из цельсия
//                K = C + 273.15
       Random random = new Random();
        double randomDouble = random.nextDouble() + random.nextInt(7, 456);
        System.out.println(Converter.runKelvinConverter(randomDouble));
        System.out.println(Converter.runFahrenheitConverter(randomDouble));

    }
}
