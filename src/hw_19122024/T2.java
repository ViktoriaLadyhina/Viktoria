package hw_19122024;

import java.util.Arrays;

class T2 {
// 11. Напишите метод, который принимает массив чисел и возвращает их сумму.
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

// 12. Напишите метод, который принимает два числа и возводит первое в степень второго.
    public static double power(int base, int exponent) {
        return base * exponent;
    }

// 13. Напишите метод, который проверяет, является ли число простым.
    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        double s = Math.sqrt(number);
        for (int i = 2; i <= s; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

// 14. Напишите метод, который принимает два числа и возвращает их наибольший общий делитель (НОД).
    public static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) { // Цикл от 1 до меньшего из a и b
            if (a % i == 0 && b % i == 0) { // Проверка, является ли i делителем обоих чисел
                gcd = i; // Обновление НОД
            }
        }
        return gcd; // Возврат НОД
    }

// 15. Напишите метод, который принимает массив чисел и возвращает его максимальный элемент.
    public static int maxInArray(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }

// 16. Напишите метод, который принимает массив чисел и возвращает его минимальный элемент.
    public static int minInArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }

// 17. Напишите метод, который проверяет, является ли число палиндромом
     // (одинаково читается слева направо и справа налево).
    public static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        String reverseStr = new StringBuilder(numStr).reverse().toString();
        if (numStr.equals(reverseStr)){
            return true;
        }
        return false;
    }

// 18. Напишите метод, который возвращает n-ое число Фибоначчи.
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

// 19. Напишите метод, который принимает массив чисел и сортирует его по возрастанию.
    public static int[] sortArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

// 20. Напишите метод, который принимает два числа и возвращает их наименьшее общее кратное (НОК).
    public static int lcm(int a, int b) {
        int max = Math.max(a, b);
        for (int i = max; ; i += max) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 4, 6, 3};

        System.out.print("11 Задача: ");
        System.out.println(sumArray(numbers));

        System.out.print("12 Задача: ");
        System.out.println(power(5, 4));

        System.out.print("13 Задача: ");
        System.out.println(isPrime(5) + " ------------------ не понятно");

        System.out.print("14 Задача: ");
        System.out.println(gcd(10, 20) + " ------------------ не понятно");

        System.out.print("15 Задача: ");
        System.out.println(maxInArray(numbers));

        System.out.print("16 Задача: ");
        System.out.println(minInArray(numbers));

        System.out.print("17 Задача: ");
        System.out.println(isPalindrome(1222));

        System.out.print("18 Задача: ");
        System.out.println(fibonacci(8)  + " ------------------ не понятно");

        System.out.print("19 Задача: ");
        System.out.println(Arrays.toString(sortArray(numbers)));

        System.out.print("20 Задача: ");
        System.out.println(lcm(10, 20) + " ------------------ не понятно");
    }
}
