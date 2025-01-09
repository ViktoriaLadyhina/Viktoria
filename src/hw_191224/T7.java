package hw_191224;

import java.util.ArrayList;
import java.util.Arrays;

public class T7 {

// 1. Напишите метод, который принимает массив строк и возвращает массив строк, отсортированный в лексикографическом порядке.
    public static String[] sortArray(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
}

// 2. Напишите метод, который принимает массив строк и возвращает самую часто встречающуюся строку.
    public static String findMostFrequentString(String[] array) {
        int maxCount = 0;
        String el = array[0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                el = array[i];
            }
        }
        return el;
    }

// 3. Напишите метод, который принимает массив строк и возвращает массив только уникальных строк.
    public static String[] getUniqueStrings(String[] array) {
        int count = 0;
        String[] arr = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            boolean dubl = true;
            for (int j = 0; j < count; j++) {
                if (array[i].equals(array[j])){
                    dubl = false;
                    break;
                }
            }
            if (dubl){
                arr[count] = array[i];
                count++;
            }
        }
        String[] unic = new String[count];
        for (int i = 0; i < count; i++) {
            unic[i] = arr[i];
        }
        return unic;
    }

// 4. Напишите метод, который принимает два массива строк и возвращает массив строк, которые присутствуют в обоих массивах.
    public static String[] findCommonStrings(String[] array1, String[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])){
                    count++;
                }
            }
        }
        String[] arr = new String[count];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])){
                    arr[index] = array1[i];
                    index++;
                }
            }
        }
        return arr;
    }

// 5. Напишите метод, который принимает массив строк и возвращает массив строк, которые являются палиндромами.
    public static String[] findPalindromes(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length() / 2; j++) {
                if (array[i].charAt(j) == array[i].charAt(array[i].length() - j -1)){
                    count++;
                    break;
                }
            }
        }
        String[] str = new String[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length() / 2; j++) {
                if (array[i].charAt(j) == array[i].charAt(array[i].length() - j -1)){
                    str[index] = array[i];
                    index++;
                    break;
                }
            }

        }
        return str;
    }

// 6. Напишите метод, который принимает массив строк и удаляет строки, содержащие заданное слово.
    public static String[] removeStringsContainingWord(String[] array, String word) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].contains(word)) {
                count++;
            }
        }
        String[] arr = new String[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (!array[i].contains(word)) {
                arr[index] = array[i];
                index++;
            }
        }

        return arr;
    }

// 7. Напишите метод, который принимает массив строк и возвращает строку с наибольшим количеством гласных.

    public static String findStringWithMostVowels(String[] array) {
        String findString = "";
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int vowelCount = 0;

            for (int j = 0; j < array[i].length(); j++) {
                char c = Character.toLowerCase(array[i].charAt(j));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }
            if (vowelCount > count) {
                count = vowelCount;
                findString = array[i];
            }
        }
        return findString;
    }

    /**
     * 8. Напишите метод, который принимает массив строк и возвращает массив строк, содержащих только буквы (без цифр или специальных символов).
     */
    public static String[] filterAlphabeticStrings(String[] array) {
        // TODO: реализовать метод
        return new String[0];
    }

    /**
     * 9. Напишите метод, который принимает массив строк и возвращает массив строк, где каждая строка перевернута (reverse).
     */
    public static String[] reverseEachString(String[] array) {
        // TODO: реализовать метод
        return new String[0];
    }

    /**
     * 10. Напишите метод, который принимает массив строк и возвращает массив строк, сгруппированных по их длине (каждая группа отдельный элемент массива).
     */
    public static String[][] groupStringsByLength(String[] array) {
        // TODO: реализовать метод
        return new String[0][0];
    }

    public static void main(String[] args) {
    String[] exampleArray = {"apple", "banana", "radar", "radar", "123", "level"};
        System.out.println("Основной массив " + Arrays.toString(exampleArray));
    String[] arr1 = {"apple", "banana", "radar", "123", "level"};
        System.out.println("Массив 1 " + Arrays.toString(arr1));
    String[] arr2 = {"apple", "radar", "level", "app"};
        System.out.println("Массив 2 " + Arrays.toString(arr2));
        System.out.println("-------------");



    System.out.println("+1. Напишите метод, который принимает массив строк и возвращает массив строк, отсортированный в лексикографическом порядке: " + Arrays.toString(sortArray(exampleArray)));
    System.out.println("+2. Напишите метод, который принимает массив строк и возвращает самую часто встречающуюся строку: " + findMostFrequentString(exampleArray));
    System.out.println("+3. Напишите метод, который принимает массив строк и возвращает массив только уникальных строк: " + Arrays.toString(getUniqueStrings(exampleArray)));
    System.out.println("+4. Напишите метод, который принимает два массива строк и возвращает массив строк, которые присутствуют в обоих массивах: " + Arrays.toString(findCommonStrings(arr1, arr2)));
    System.out.println("+5. Напишите метод, который принимает массив строк и возвращает массив строк, которые являются палиндромами: " + Arrays.toString(findPalindromes(exampleArray)));
    System.out.println("+6. Напишите метод, который принимает массив строк и удаляет строки, содержащие заданное слово: " + Arrays.toString(removeStringsContainingWord(exampleArray, "radar")));
    System.out.println("+7. Напишите метод, который принимает массив строк и возвращает строку с наибольшим количеством гласных: " + findStringWithMostVowels(exampleArray));
    }
}
