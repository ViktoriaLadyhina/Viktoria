package hw_031224;

import java.util.Arrays;

public class Task_1_15 {

    public static void main(String[] args) {
        System.out.println("-------------");
       task1();
        System.out.println("-------------");
       task2();
        System.out.println("-------------");
       task3();
        System.out.println("-------------");
       task4();
        System.out.println("-------------");
       task5();
        System.out.println("-------------");
       task6();
        System.out.println("-------------");
       task7();
        System.out.println("-------------");
       task8();
        System.out.println("-------------");
       task9();
        System.out.println("-------------");
       task10();
        System.out.println("-------------");
       task11();
        System.out.println("-------------");
       task12();
        System.out.println("-------------");
       task13();
        System.out.println("-------------");
       task14();
        System.out.println("-------------");
       task15();

    }

//     1. Найти сумму элементов массива.
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        System.out.println("+1. Было: " + Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Найти сумму элементов массива: " + sum);
    }

    // 2. Найти минимальный элемент массива.
    public static void task2() {
        int[] array = {4, 2, -1, 7};
        System.out.println("+2. Было: " + Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
               min = array[i];
            }
        }
        System.out.println("Найти минимальный элемент массива: " + min);
    }

    // 3. Найти максимальный элемент массива.
    public static void task3() {
        int[] array = {4, 2, -1, 7};
        System.out.println("+3. Было: " + Arrays.toString(array));
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Найти максимальный элемент массива: " + max);
    }

    // 4. Найти индекс минимального элемента массива.
    public static void task4() {
        int[] array = {4, 2, -1, 7};
        System.out.println("+4. Было: " + Arrays.toString(array));
        int minInd = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minInd > array[i]) {
                minInd = i;
            }
        }
        System.out.println("Найти индекс минимального элемента массива: " + minInd);
    }

    // 5. Найти индекс максимального элемента массива.
    public static void task5() {
        int[] array = {4, 2, -1, 7};
        System.out.println("+5. Было: " + Arrays.toString(array));
        int maxInd = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxInd < array[i]) {
                maxInd = i;
            }
        }
        System.out.println("Найти индекс максимального элемента массива: " + maxInd);
    }

    // 6. Посчитать количество положительных элементов.
    public static void task6() {
        int[] array = {4, -2, 0, 7};
        System.out.println("+6. Было: " + Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                count++;
            }
        }
        System.out.println("Посчитать количество положительных элементов: " + count);
    }

    // 7. Посчитать количество отрицательных элементов.
    public static void task7() {
        int[] array = {4, -2, 0, -7};
        System.out.println("+7. Было: " + Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                count++;
            }
        }
        System.out.println("Посчитать количество отрицательных элементов: " + count);
    }

    // 8. Посчитать количество четных элементов.
    public static void task8() {
        int[] array = {4, -2, 0, 7};
        System.out.println("+8. Было: " + Arrays.toString(array));
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("Посчитать количество четных элементов: " + even);
    }

    // 9. Посчитать количество нечетных элементов.
    public static void task9() {
        int[] array = {4, -2, 0, 7};
        System.out.println("+9. Было: " + Arrays.toString(array));
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
            even++;
            }
        }
        System.out.println("Посчитать количество нечетных элементов: " + even);
    }

    // 10. Проверить, есть ли в массиве заданное число.
    public static void task10() {
        int[] array = {4, -2, 0, 7};
        System.out.println("+10. Было: " + Arrays.toString(array));
        int target = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                System.out.println("Проверить, есть ли в массиве заданное число: " + true);
            }
        }
    }

    // 11. Найти среднее арифметическое элементов массива.
    public static void task11() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("+11. Было: " + Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Найти среднее арифметическое элементов массива: " + sum / array.length);
    }

    // 12. Вывести все элементы массива, которые больше среднего значения.
    public static void task12() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("+12. Было: " + Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int avg = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg){
                System.out.println("Вывести все элементы массива, которые больше среднего значения: " + array[i]);
            }
        }
    }

    // 13. Проверить, упорядочен ли массив по возрастанию.
    public static void task13() {
        int[] array = {1, 2, 3, 4};
        System.out.println("+13. Было: " + (Arrays.toString(array)));
        boolean ordArr = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    ordArr = false;
                }
            }
        }
        System.out.println("Проверить, упорядочен ли массив по возрастанию: " + ordArr);
    }

    // 14. Найти второй по величине элемент массива.
    public static void task14() {
        int[] array = {1, -2, 3, -4};
        System.out.println("+14. Было: " + (Arrays.toString(array)));
        int firstMin = array[0];
        int secondMin = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < firstMin){
                secondMin = firstMin;
                firstMin = array[i];
            }
            if (array[i] > secondMin && array[i] > firstMin){
                    secondMin = array[i];
            }
        }
        System.out.println("Найти второй по величине элемент массива: " + firstMin);
        System.out.println("Найти второй по величине элемент массива: " + secondMin);
    }

    // 15. Переставить элементы массива в обратном порядке.
    public static void task15() {
        int[] array = {1, 2, 3, 4};
        System.out.println("+15. Было: " + (Arrays.toString(array)));
        for (int i = 0; i < array.length / 2; i++) {
        int a = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = a;
        }
        System.out.println("Переставить элементы массива в обратном порядке: " + (Arrays.toString(array)));
    }
}
