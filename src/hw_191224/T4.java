package hw_191224;

import java.util.Arrays;

public class T4 {

// 1. Напишите метод, который принимает массив целых чисел и удваивает каждый его элемент.
    public static int[] doubleArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        return array;
    }

// 2. Напишите метод, который принимает массив целых чисел и
     // возвращает массив только с положительными числами.
    public static int[] filterPositiveNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
           if(array[i] > 0){
               count++;
           }
        }
        int[] posArr = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                posArr[index] = array[i];
                index++;
            }
        }
        return posArr;
    }

// 3. Напишите метод, который принимает два массива
      public static int[] mergeArrays(int[] array1, int[] array2) {
        int [] totalArr = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, totalArr, 0, array1.length);
        System.arraycopy(array2, 0, totalArr, array1.length, array2.length);
    return totalArr;
    }

// 4. Напишите метод, который принимает массив целых чисел и возвращает количество уникальных элементов.
    public static int countUniqueElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]){
                    count++;
                }
            }

        }
        return count;
    }

// 5. Напишите метод, который принимает массив целых чисел и возвращает новый массив, содержащий квадраты элементов исходного массива.
    public static int[] squareArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        return array;
    }

// 6. Напишите метод, который принимает массив целых чисел и возвращает второй по величине элемент.
    public static int findSecondLargest(int[] array) {
        int firstMax = array[0];
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if(firstMax > array[i]){
                secondMax = firstMax;
                firstMax = array[i];
            }
            if (secondMax < array[i] && array[i] > firstMax){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

// 7. Напишите метод, который принимает массив целых чисел и возвращает true, если массив содержит заданное число.
    public static boolean containsNumber(int[] array, int number) {
        boolean containsNumber = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                containsNumber = true;
            }
        }
        return containsNumber;
    }

// 8. Напишите метод, который принимает массив целых чисел и заменяет все отрицательные числа на 0.
    public static int[] replaceNegativesWithZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i] = 0;
            }
        }
        return array;
    }

// 9. Напишите метод, который принимает массив целых чисел и возвращает индекс первого вхождения заданного числа.
    public static int findFirstIndex(int[] array, int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }

// 10. Напишите метод, который принимает массив целых чисел и возвращает true, если в массиве нет повторяющихся элементов.
    public static boolean hasNoDuplicates(int[] array) {
        boolean dubl = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    dubl = false;
                    break;
                }

            }
        }
        return dubl;
    }

    public static void main(String[] args) {
        int[] exampleArray = {1, -2, 3, 4, -5};

        System.out.println(Arrays.toString(exampleArray));

        System.out.println("1. Напишите метод, который принимает массив целых чисел и удваивает каждый его элемент: " + Arrays.toString(doubleArrayElements(exampleArray)));

        int[] exampleArray1 = {1, -2, 3, 4, -5};

        System.out.println("2. Напишите метод, который принимает массив целых чисел и возвращает массив только с положительными числами: " + Arrays.toString(filterPositiveNumbers(exampleArray)));

        int[] exampleArray2 = {6, 7, 8, 9, 10};

        System.out.println("3. Напишите метод, который принимает два массива: " + Arrays.toString(mergeArrays(exampleArray1, exampleArray2)));

        System.out.println("4. Напишите метод, который принимает массив целых чисел и возвращает количество уникальных элементов: " + countUniqueElements(exampleArray1));

        System.out.println("5. Напишите метод, который принимает массив целых чисел и возвращает новый массив, содержащий квадраты элементов исходного массива: " + Arrays.toString(squareArrayElements(exampleArray1)));

        int[] exampleArray3 = {1, -2, 3, 4, -5};

        System.out.println("6. Напишите метод, который принимает массив целых чисел и возвращает второй по величине элемент: " + findSecondLargest(exampleArray3));

        System.out.println("7. Напишите метод, который принимает массив целых чисел и возвращает true, если массив содержит заданное число (5): " + containsNumber(exampleArray3, 5));

        System.out.println("8. Напишите метод, который принимает массив целых чисел и заменяет все отрицательные числа на 0: " + Arrays.toString(replaceNegativesWithZero(exampleArray3)));

        int[] exampleArray4 = {1, -2, 3, 4, -5};

        System.out.println("9. Напишите метод, который принимает массив целых чисел и возвращает индекс первого вхождения заданного числа: " + findFirstIndex(exampleArray4, 4));

        System.out.println("10. Напишите метод, который принимает массив целых чисел и возвращает true, если в массиве нет повторяющихся элементов: " + hasNoDuplicates(exampleArray4));
    }
}
