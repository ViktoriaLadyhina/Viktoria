package hw_191224;

import java.util.Arrays;

public class T5 {

// 1. Напишите метод, который принимает массив целых чисел и возвращает все подмассивы длиной 2.
    public static int[] generateSubArrays(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] <= 99){
                count++;
            }
        }

        int[] arr= new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] <= 99){
                arr[index] = array[i];
                index++;
            }
        }
        return arr;
    }

    /**
     * 2. Напишите метод, который принимает массив целых чисел и возвращает true, если массив является палиндромом.
     */
    public static boolean isArrayPalindrome(int[] arr) {
        boolean n = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length; j > 0; j--) {
                if (arr[i] == arr[j-1] ){
                    n = true;
                }
            }
        }
        return n;
    }

    /**
     * 3. Напишите метод, который принимает массив целых чисел и возвращает самый часто встречающийся элемент.
     */
    public static int findMostFrequentElement(int[] array) {
        return 0;
    }

// 4. Напишите метод, который принимает массив целых чисел и сортирует его без использования встроенных методов сортировки.
//    public static int[] sortArrayManually(int[] array) {
//        boolean isSorted = false;
//        int tmp;
//        while (!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    tmp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = tmp;
//                    isSorted = false;
//                }
//            }
//        }
//        return array;
//    }

    /**
     * 5. Напишите метод, который принимает массив целых чисел и
     * переставляет элементы массива в случайном порядке.
     */
    public static int[] shuffleArray(int[] array) {
        // TODO: реализовать метод
        return array;
    }

    /**
     * 6. Напишите метод, который принимает массив целых
     * чисел и возвращает новый массив с уникальными элементами.
     */
    public static int[] removeDuplicates(int[] array) {
        // TODO: реализовать метод
        return new int[0];
    }

    /**
     * 7. Напишите метод, который принимает массив целых
     * чисел и возвращает его циклически сдвинутым вправо на k позиций.
     */
    public static int[] rotateArrayRight(int[] array, int k) {
        // TODO: реализовать метод
        return new int[0];
    }

    /**
     * 8. Напишите метод, который принимает два массива
     * целых чисел и возвращает их пересечение.
     */
    public static int[] findArrayIntersection(int[] array1, int[] array2) {
        // TODO: реализовать метод
        return new int[0];
    }

    /**
     * 9. Напишите метод, который принимает массив целых чисел и
     * возвращает true, если в массиве есть дублирующиеся элементы.
     */
    public static boolean hasDuplicates(int[] array) {
        // TODO: реализовать метод
        return false;
    }

    /**
     * 10. Напишите метод, который принимает массив целых чисел и
     * возвращает максимальную сумму подмассива (алгоритм Кадане).
     */
    public static int maxSubarraySum(int[] array) {
        // TODO: реализовать метод
        return 0;
    }

    public static void main(String[] args) {
         int[] exampleArray = {1, 2, 5, 54, 65, 99};
        System.out.println(Arrays.toString(exampleArray));

         System.out.println("+1. Напишите метод, который принимает массив целых чисел и возвращает все подмассивы длиной 2: " + Arrays.toString(generateSubArrays(exampleArray)));
         System.out.println("-2. Напишите метод, который принимает массив целых чисел и возвращает true, если массив является палиндромом: " + isArrayPalindrome(exampleArray));

         //System.out.println("4. Напишите метод, который принимает массив целых чисел и сортирует его без использования встроенных методов сортировки: " + Arrays.toString(sortArrayManually(exampleArray)));
    }
}