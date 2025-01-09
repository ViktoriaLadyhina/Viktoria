package hw_191224;

import java.util.Arrays;

public class T11 {

// 1. Напишите метод, который принимает массив логических значений и возвращает количество значений true.
    public static int countTrue(boolean[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]){
                count++;
            }
        }
        return count;
    }

// 2. Напишите метод, который принимает массив логических значений и возвращает true, если все элементы равны true.
    public static boolean areAllTrue(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!array[i]){
                return false;
            }
        }
        return true;
    }

// 3. Напишите метод, который принимает массив логических значений и возвращает true, если хотя бы один элемент равен true.
    public static boolean containsTrue(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]){
                return true;
            }
        }
        return false;
    }

// 4. Напишите метод, который принимает массив логических значений и возвращает массив с противоположными значениями.
    public static boolean[] invertArray(boolean[] array) {
        boolean[] n = new boolean[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]){
                n[index] = false;
                index++;
            }
            if(!array[i]){
                n[index] = true;
                index++;
            }

        }
        return n;
    }

// 5. Напишите метод, который принимает массив логических значений и возвращает количество значений false.
    public static int countFalse(boolean[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(!array[i]){
                count++;
            }
        }
        return count;
    }

    /**
     * 6. Напишите метод, который принимает два массива логических значений и возвращает их логическое И (AND) поэлементно.
     */
    public static boolean[] andArrays(boolean[] array1, boolean[] array2) {
        // TODO: реализовать метод
        return new boolean[0];
    }

    /**
     * 7. Напишите метод, который принимает два массива логических значений и возвращает их логическое ИЛИ (OR) поэлементно.
     */
    public static boolean[] orArrays(boolean[] array1, boolean[] array2) {
        // TODO: реализовать метод
        return new boolean[0];
    }

// 8. Напишите метод, который принимает массив логических значений и возвращает true, если количество значений true больше, чем false.
    public static boolean moreTrueThanFalse(boolean[] array) {
        int countTr = 0;
        int countFal = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]){
                countTr++;
            }
            if (!array[i]){
                countFal++;
            }
            if(countFal > countTr){
                return false;
            }
        }
        return true;
    }

// 9. Напишите метод, который принимает массив логических значений и возвращает индекс первого значения true.
    public static int firstTrueIndex(boolean[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]){
                index = i;
                break;
            }
        }
        return index;
    }

// 10. Напишите метод, который принимает массив логических значений и возвращает true, если массив симметричен (палиндром).
    public static boolean isSymmetric(boolean[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - i - 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean[] exampleArray = {true, false, true, false, true};
        System.out.println(Arrays.toString(exampleArray));
        System.out.println("--------------");

        System.out.println("1. Напишите метод, который принимает массив логических значений и возвращает количество значений true: " + countTrue(exampleArray));
        System.out.println("2. --//-- и возвращает true, если все элементы равны true: " + areAllTrue(exampleArray));
        System.out.println("3. --//-- и возвращает true, если хотя бы один элемент равен true: " + containsTrue(exampleArray));
        System.out.println("4. --//-- и возвращает массив с противоположными значениями: " + Arrays.toString(invertArray(exampleArray)));
        System.out.println("5. --//-- и возвращает количество значений false: " + countFalse(exampleArray));
        System.out.println("8. --//-- и возвращает true, если количество значений true больше, чем false: " + moreTrueThanFalse(exampleArray));
        System.out.println("9. --//-- и возвращает индекс первого значения true: " + firstTrueIndex(exampleArray));
        System.out.println("10. --//-- и возвращает true, если массив симметричен (палиндром): " + isSymmetric(exampleArray));
    }
}
