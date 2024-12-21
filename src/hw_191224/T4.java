package hw_191224;

import java.util.Arrays;

public class T4 {

    /**
     * 1. Напишите метод, который принимает массив целых чисел и удваивает каждый его элемент.
     */
    public static int[] doubleArrayElements(int[] array) {
        // TODO: реализовать метод
        return new int[0];
    }

    /**
     * 2. Напишите метод, который принимает массив целых чисел и
     * возвращает массив только с положительными числами.
     */
    public static int[] filterPositiveNumbers(int[] array) {
        // TODO: реализовать метод
        return new int[0];
    }

    /**
     * 3. Напишите метод, который принимает два массива
     * целых чисел и возвращает их объединение.
     */
    public static int[] mergeArrays(int[] array1, int[] array2) {
        // TODO: реализовать метод
        return new int[0];
    }

    /**
     * 4. Напишите метод, который принимает массив целых
     * чисел и возвращает количество уникальных элементов.
     */
    public static int countUniqueElements(int[] array) {
        // TODO: реализовать метод
        return 0;
    }

    /**
     * 5. Напишите метод, который принимает массив целых
     * чисел и возвращает новый массив, содержащий квадраты элементов исходного массива.
     */
    public static int[] squareArrayElements(int[] array) {
        // TODO: реализовать метод
        return new int[0];
    }

    /**
     * 6. Напишите метод, который принимает массив целых чисел и возвращает второй по величине элемент.
     */
    public static int findSecondLargest(int[] array) {
        // TODO: реализовать метод
        return 0;
    }

// 7. Напишите метод, который принимает массив целых чисел и
     // возвращает true, если массив содержит заданное число.
    public static boolean containsNumber(int[] array, int number) {
        boolean containsNumber = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                containsNumber = true;
            }
        }
        return containsNumber;
    }

// 8. Напишите метод, который принимает массив целых чисел
     // и заменяет все отрицательные числа на 0.
    public static int[] replaceNegativesWithZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i] = 0;
            }
        }
        return array;
    }

    /**
     * 9. Напишите метод, который принимает массив целых
     * чисел и возвращает индекс первого вхождения заданного числа.
     */
    public static int findFirstIndex(int[] array, int number) {
        // TODO: реализовать метод
        return -1;
    }

    /**
     * 10. Напишите метод, который принимает массив целых ч
     * исел и возвращает true, если в массиве нет повторяющихся элементов.
     */
    public static boolean hasNoDuplicates(int[] array) {
        // TODO: реализовать метод
        return false;
    }

    public static void main(String[] args) {
         int[] exampleArray = {1, -2, 3, 4, -5};
        // System.out.println(Arrays.toString(doubleArrayElements(exampleArray)));

        System.out.print("7 задача: ");
        System.out.println(containsNumber(exampleArray, 5));

        System.out.print("7 задача: ");
        System.out.println(Arrays.toString(replaceNegativesWithZero(exampleArray)));
    }
}
