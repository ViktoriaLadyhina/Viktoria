package hw_19122024;

public class Task1 {

// 1. Напишите метод, который принимает два целых числа и возвращает их сумму.
    public static int add(int a, int b) {
        return a + b;
    }

// 2. Напишите метод, который принимает два числа и возвращает их разность.
    public static int subtract(int a, int b) {
        return a - b;
    }

// 3. Напишите метод, который принимает два числа и возвращает их произведение.
    public static int multiply(int a, int b) {
        return a * b;
    }

// 4. Напишите метод, который принимает два числа и возвращает их частное.
    public static double divide(double a, double b) {
        return a / b;
    }

// 5. Напишите метод, который принимает число и возвращает его квадрат.
    public static int square(int a) {
        return a * a;
    }

// 6. Напишите метод, который принимает три числа и возвращает их среднее арифметическое.
    public static double average(int a, int b, int c) {
        return (a + b + c)/3;
    }

// 7. Напишите метод, который принимает два числа и возвращает остаток от их деления.
    public static int modulus(int a, int b) {
        return a % b;
    }

// 8. Напишите метод, который принимает два числа и возвращает большее из них.
    public static int max(int a, int b) {
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

// 9. Напишите метод, который принимает два числа и возвращает меньшее из них.
    public static int min(int a, int b) {
        if(a < b){
            return a;
        } else {
            return b;
        }
    }

// 10. Напишите метод, который принимает число и проверяет, является ли оно четным.
     // Возвращает true, если число четное, и false, если нечетное.
    public static boolean isEven(int a) {
        if (a % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("1 Задача: ");
        System.out.println(add(3, 5));

        System.out.print("2 Задача: ");
        System.out.println(subtract(5, 3));

        System.out.print("3 Задача: ");
        System.out.println(multiply(5, 3));

        System.out.print("4 Задача: ");
        System.out.println(divide(6, 3));

        System.out.print("5 Задача: ");
        System.out.println(square(5));

        System.out.print("6 Задача: ");
        System.out.println(average(5, 6, 8));

        System.out.print("7 Задача: ");
        System.out.println(modulus(5, 6));

        System.out.print("8 Задача: ");
        System.out.println(max(10, 6));

        System.out.print("9 Задача: ");
        System.out.println(min(5, 2));

        System.out.print("10 Задача: ");
        System.out.println(isEven(8));




    }
}
