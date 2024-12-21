package hw_191224;

import java.util.Arrays;

public class T3 {

// 1. Напишите метод, который принимает массив целых чисел и возвращает его длину.
    public static int getArrayLength(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }

// 2. Напишите метод, который принимает массив целых чисел и выводит его элементы в консоль.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

// 3. Напишите метод, который принимает массив целых чисел и возвращает сумму его элементов.
    public static int sumArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

// 4. Напишите метод, который принимает массив целых чисел и возвращает максимальный элемент.
    public static int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

// 5. Напишите метод, который принимает массив целых чисел и возвращает минимальный элемент.
    public static int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

// 6. Напишите метод, который принимает массив целых чисел и возвращает
     // новый массив, содержащий только чётные элементы.
    public static int[] filterEvenNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count++;
            }
        }
        int[] evenArr = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                evenArr[index] = array[i];
                index++;
            }
        }
        return evenArr;
    }

// 7. Напишите метод, который принимает массив целых чисел и
     // возвращает массив в обратном порядке.
    public static int[] reverseArray(int[] array) {
        int[] reverArr = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverArr[index] = array[i];
            index++;
        }
        return reverArr;
    }

// 8. Напишите метод, который принимает массив целых чисел и возвращает true,
     // если массив отсортирован по возрастанию.
    public static boolean isArraySorted(int[] array) {
        boolean ordArr = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    ordArr = false;
                }
            }
        }
        return ordArr;
    }

// 9. Напишите метод, который принимает массив целых чисел и возвращает
     // среднее арифметическое его элементов.
    public static double calculateAverage(int[] array) {
        int sum = 0;
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            mean = (double) sum / array.length;
        }
        return mean;
    }

// 10. Напишите метод, который принимает массив целых чисел и
     // возвращает количество чётных чисел в массиве.
    public static int countEvenNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5, 6, 8};
        System.out.print("1 задача: ");
        System.out.println(getArrayLength(exampleArray));

        System.out.print("2 задача: ");
        printArray(exampleArray);

        System.out.println();
        System.out.print("3 задача: ");
        System.out.println(sumArrayElements(exampleArray));

        System.out.print("4 задача: ");
        System.out.println(findMaxElement(exampleArray));

        System.out.print("5 задача: ");
        System.out.println(findMinElement(exampleArray));

        System.out.print("6 задача: ");
        System.out.println(Arrays.toString(filterEvenNumbers(exampleArray)));

        System.out.print("7 задача: ");
        System.out.println(Arrays.toString(reverseArray(exampleArray)));

        System.out.print("8 задача: ");
        System.out.println(isArraySorted(exampleArray));

        System.out.print("9 задача: ");
        System.out.println(calculateAverage(exampleArray));

        System.out.print("10 задача: ");
        System.out.println(countEvenNumbers(exampleArray));
    }
}
