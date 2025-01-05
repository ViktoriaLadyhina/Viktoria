package com.app._19_12_2024;

import java.util.Arrays;

public class T8 {
// 1. Напишите метод, который принимает массив символов и возвращает его длину.
    public static int getArrayLength(char[] array) {
        int leng = array.length;
        return leng;
    }

// 2. Напишите метод, который принимает массив символов и выводит его элементы в консоль.
    public static void printArray(char[] array) {
        System.out.println(array);
    }

// 3. Напишите метод, который принимает массив символов и возвращает первый символ.
    public static char getFirstElement(char[] array) {
        return array[0];
    }

// 4. Напишите метод, который принимает массив символов и возвращает последний символ.
    public static char getLastElement(char[] array) {
        return array[array.length-1];
    }

// 5. Напишите метод, который принимает массив символов и возвращает массив в обратном порядке.
    public static void reverseArray(char[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }

    /**
     * 6. Напишите метод, который принимает массив символов и возвращает количество гласных букв в массиве.
     */
    public static int countVowels(char[] array) {
        // TODO: реализовать метод
        return 0;
    }

    /**
     * 7. Напишите метод, который принимает массив символов и заменяет все буквы на заглавные.
     */
    public static char[] toUpperCase(char[] array) {
        // TODO: реализовать метод
        return new char[0];
    }

    /**
     * 8. Напишите метод, который принимает массив символов и проверяет, является ли он палиндромом.
     */
    public static boolean isPalindrome(char[] array) {
        // TODO: реализовать метод
        return false;
    }

// 9. Напишите метод, который принимает массив символов и возвращает количество пробелов в массиве.
    public static int countSpaces(char[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' '){
                count++;
            }
        }
        return count;
    }

// 10. Напишите метод, который принимает массив символов и заменяет все цифры на символ '*'.
    public static char[] replaceDigitsWithAsterisk(char[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = '*';
        }
        return array;
    }

    public static void main(String[] args) {
    char[] exampleArray = {'a', 'b', 'c', '1', '2', ' ', 'e'};
    System.out.println(exampleArray);

    System.out.println("+1. Напишите метод, который принимает массив символов и возвращает его длину: " + getArrayLength(exampleArray));
    System.out.print("+2. Напишите метод, который принимает массив символов и выводит его элементы в консоль: ");
    printArray(exampleArray);
    System.out.println("+3. Напишите метод, который принимает массив символов и возвращает первый символ: " + getFirstElement(exampleArray));
    System.out.println("+4. Напишите метод, который принимает массив символов и возвращает последний символ: " + getLastElement(exampleArray));
    //System.out.println(reverseArray(exampleArray));
    System.out.println("+9. Напишите метод, который принимает массив символов и возвращает количество пробелов в массиве: " + countSpaces(exampleArray));
    System.out.println("+10. Напишите метод, который принимает массив символов и заменяет все цифры на символ '*': " + Arrays.toString(replaceDigitsWithAsterisk(exampleArray)));
    }
}
