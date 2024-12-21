package hw_031224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_16_30 {

    public static void main(String[] args) {

        System.out.println("----------------");
        task16();
        System.out.println("----------------");
        task17();
        System.out.println("----------------");
        task18();
        System.out.println("----------------");
        System.out.println("19 task - delete");
        System.out.println("----------------");
        task20();
        System.out.println("----------------");
        task21();
        System.out.println("----------------");
        task22();
        System.out.println("----------------");
        task23();
        System.out.println("----------------");
        task24();
        System.out.println("----------------");
        task25();
        System.out.println("----------------");
        task26();
        System.out.println("----------------");
        task27();
        System.out.println("----------------");
        task28();
        System.out.println("----------------");
        task29();
        System.out.println("----------------");
        task30();

    }

    // 16. Найти все пары элементов, сумма которых равна заданному числу.
    public static void task16() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("+16. Было: " + (Arrays.toString(array)));
        int target = 6;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target){
                System.out.println("Найти все пары элементов, сумма которых равна заданному числу (6): (" + array[i] + ", " + array[j] + ")");
                }
            }
        }
    }

    // 17. Проверить, есть ли в массиве дубликаты.
    public static void task17() {
        int[] array = {1, 2, 3, 4, 2};
        System.out.println("+17. Было: " + (Arrays.toString(array)));
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                hasDuplicates = true;
                    break;
                }
            }
        }
        System.out.println("Проверить, есть ли в массиве дубликаты: " + hasDuplicates);
    }

//     18. Удалить все нули из массива и сдвинуть элементы влево.
    public static void task18() {
        int[] array = {0, 1, 0, 3, 0};
        System.out.println("+18. Было: " + (Arrays.toString(array)));
        int cuont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                cuont++;
            }
        }
        int[] array2 = new int[array.length - cuont];
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                array2[n++] = array[i];
            }
        }
        System.out.println("Удалить все нули из массива и сдвинуть элементы влево: " + (Arrays.toString(array2)));
    }

    // 20. Найти количество чисел, делящихся на заданное число без остатка.
    public static void task20() {
        int[] array = {10, 15, 20, 25, 30, 23};
        System.out.println("+20. Было: " + (Arrays.toString(array)));
        int divisor = 5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0){
                count++;
            }
        }
        System.out.println("Найти количество чисел, делящихся на заданное число без остатка: " + count);
    }

    // 21. Упорядочить массив по возрастанию.
    public static void task21() {
        int[] array = {4, 2, 7, 1, 3};
        System.out.println("+21. Было: " + (Arrays.toString(array)));

// 1 метод - через метод Arrays.sort:
// Arrays.sort(array);

// Пузырьковый метод:
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Упорядочить массив по возрастанию: " + (Arrays.toString(array)));
    }

    // 22. Найти индекс первого отрицательного элемента.
    public static void task22() {
        int[] array = {1, 2, -3, 4, -5};
        System.out.println("+22. Было: " + (Arrays.toString(array)));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                System.out.println("Найти индекс первого отрицательного элемента: " + i);
                break;
            }
        }
    }

    // 23. Подсчитать сумму чисел на четных индексах.
    public static void task23() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("+23. Было: " + (Arrays.toString(array)));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Подсчитать сумму чисел на четных индексах: " + sum);
    }

    // 24. Найти произведение всех элементов массива.
    public static void task24() {
        int[] array = {1, 2, 3, 4};
        System.out.println("+24. Было: " + (Arrays.toString(array)));
        int multi = array[0];
        for (int i = 1; i < array.length; i++) {
            multi = multi * array[i];
        }
        System.out.println("Найти произведение всех элементов массива: " + multi);
    }

    // 25. Переместить все отрицательные числа в конец массива.
    public static void task25() {
        int[] array = {1, -2, 3, -4, 5};
        System.out.println("+25. Было: " + (Arrays.toString(array)));
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < 0 && array[j + 1] > 0) {
                    temp = array[j]; // не все понятно...
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Переместить все отрицательные числа в конец массива: " + (Arrays.toString(array)));
    }

    // 26. Найти количество уникальных элементов в массиве.
    public static void task26() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("+26. Было: " + (Arrays.toString(array)));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j){
                    break;
                }
                if (j == array.length - 1){
                    count++;
                }
            }
        }
        System.out.println("Найти количество уникальных элементов в массиве: " + count);
    }

    // 27. Переставить минимальный элемент массива в начало.
    public static void task27() {
        int[] array = {3, 2, 1, 4, 5};
        System.out.println("+27. Было: " + (Arrays.toString(array)));

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]){
                min = i;
            }
            if (min != 0){
                int temp = array[0];
                array[0] = array[min];
                array[min] = temp;
            }
        }
        System.out.println("Переставить минимальный элемент массива в начало: " + (Arrays.toString(array)));
    }

    // 28. Найти длину самой длинной последовательности одинаковых элементов.
    public static void task28() {
        int[] array = {1, 1, 2, 2, 2, 3};
        System.out.println("+28. Было: " + (Arrays.toString(array)));
        int max = 1;
        int cur = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]){
                cur++;
            } else {
                if (cur > max) {
                    max = cur;
                    cur = 1;
                }
                if (cur > max) {
                    max = cur;
                }
            }
        }
        System.out.println("Найти длину самой длинной последовательности одинаковых элементов: " + max);
}

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
    public static void task29() {
        int[] array = {1, -2, 3, 4, -5};
        System.out.println("+29. Было: " + (Arrays.toString(array)));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                int n = i;
                for (int j = n; j < array.length; j++) {
                    if (array[j] > 0){
                        sum = sum + array[j];
                    }
                }
            }
        }
        System.out.println("Найти сумму положительных элементов, расположенных после первого отрицательного: " + sum);
    }

    // 30. Удалить все дубликаты из массива.
    public static void task30() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("+30. Было: " + (Arrays.toString(array)));

        int[] array2 = new int [array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean dubl = false;
            for (int j = 0; j < count; j++) {
                if (array[i] == array2[j]) {
                    dubl = true;
                    break;
                }
            }
            if (!dubl) {
            array2[count++] = array[i];
            }
        }
        int[] array3 = Arrays.copyOf(array2, count);
            System.out.println("Удалить все дубликаты из массива: " + (Arrays.toString(array3)));
    }
}
