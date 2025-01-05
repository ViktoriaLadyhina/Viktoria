package hw_191224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

    /**
     * 3. Напишите метод, который принимает массив строк и возвращает массив только уникальных строк.
     */
    public static String[] getUniqueStrings(String[] array) {
        // TODO: реализовать метод
        return new String[0];
    }

    /**
     * 4. Напишите метод, который принимает два массива строк и возвращает массив строк, которые присутствуют в обоих массивах.
     */
    public static String[] findCommonStrings(String[] array1, String[] array2) {
        // TODO: реализовать метод
        return new String[0];
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

        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.removeIf(str -> str.contains(word));

        return list.toArray(new String[0]);
    }

    /**
     * 7. Напишите метод, который принимает массив строк и возвращает строку с наибольшим количеством гласных.
     */
    public static String findStringWithMostVowels(String[] array) {
        // TODO: реализовать метод
        return "";
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
    System.out.println(Arrays.toString(exampleArray));

    System.out.println("+1. Напишите метод, который принимает массив строк и возвращает массив строк, отсортированный в лексикографическом порядке: " + Arrays.toString(sortArray(exampleArray)));
    System.out.println("+2. Напишите метод, который принимает массив строк и возвращает самую часто встречающуюся строку: " + findMostFrequentString(exampleArray));
    System.out.println("+5. Напишите метод, который принимает массив строк и возвращает массив строк, которые являются палиндромами: " + Arrays.toString(findPalindromes(exampleArray)));
    System.out.println("+6. Напишите метод, который принимает массив строк и удаляет строки, содержащие заданное слово: " + Arrays.toString(removeStringsContainingWord(exampleArray, "radar")));
    }
}
