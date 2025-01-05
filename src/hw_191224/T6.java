package com.app._19_12_2024;

import java.util.Arrays;

public class T6 {

// 1. Напишите метод, который принимает массив строк и возвращает его длину.
    public static int getArrayLength(String[] array) {
        int leng = array.length;
        return leng;
    }

// 2. Напишите метод, который принимает массив строк и выводит его элементы в консоль.
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

// 3. Напишите метод, который принимает массив строк и возвращает первую строку.
    public static String getFirstElement(String[] array) {
        return array[0];
    }

// 4. Напишите метод, который принимает массив строк и возвращает последнюю строку.
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

// 5. Напишите метод, который принимает массив строк и возвращает массив строк в обратном порядке.
    public static void reverseArray(String[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }

// 6. Напишите метод, который принимает массив строк и возвращает длину самой длинной строки.
    public static int getLongestStringLength(String[] array) {
        int maxStr = 0;
        for (int i = 0; i < array.length; i++) {
           if (array[i].length() > maxStr){
               maxStr = array[i].length();
           }
        }
        return maxStr;
    }

// 7. Напишите метод, который принимает массив строк и возвращает строку с максимальной длиной.
    public static String getLongestString(String[] array) {
        int maxStr = 0;
        String max = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxStr){
                maxStr = array[i].length();
                max = array[i];
            }
        }
        return max;
    }

// 8. Напишите метод, который принимает массив строк и возвращает true, если массив содержит заданную строку.

    public static boolean containsString(String[] array, String target) {
        boolean containsStr = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)){
                containsStr = true;
                break;
            }
        }
        return containsStr;
    }

// 9. Напишите метод, который принимает массив строк и возвращает количество строк, которые начинаются с заданной буквы.
    public static int countStringsStartingWith(String[] array, char letter) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].startsWith(String.valueOf(letter))){
                count++;
            }
        }
        return count;
    }

    /**
     * 10. Напишите метод, который принимает массив строк и возвращает массив строк в верхнем регистре.
     */
    public static String[] convertToUpperCase(String[] array) {
        String strUpper = "";
        String[] strUpp = new String[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            strUpper = array[i].toUpperCase();
            strUpp[index] = strUpper;
            index++;
        }
        return strUpp;
    }

    public static void main(String[] args) {
         String[] exampleArray = {"apple", "banana", "cherry"};
         System.out.println(Arrays.toString(exampleArray));

         System.out.println("+1. Напишите метод, который принимает массив строк и возвращает его длину: " + getArrayLength(exampleArray));

         System.out.print("+2. Напишите метод, который принимает массив строк и выводит его элементы в консоль: ");
         printArray(exampleArray);

         System.out.println("\n+3. Напишите метод, который принимает массив строк и возвращает первую строку: " + getFirstElement(exampleArray));

         System.out.println("+4. Напишите метод, который принимает массив строк и возвращает последнюю строку: " + getLastElement(exampleArray));

         System.out.print("+5. Напишите метод, который принимает массив строк и возвращает массив строк в обратном порядке: ");
         reverseArray(exampleArray);

         System.out.println("\n+6. Напишите метод, который принимает массив строк и возвращает длину самой длинной строки: " + getLongestStringLength(exampleArray));

         System.out.println("+7. Напишите метод, который принимает массив строк и возвращает строку с максимальной длиной: " + getLongestString(exampleArray));

         System.out.println("+8. Напишите метод, который принимает массив строк и возвращает true, если массив содержит заданную строку: " + containsString(exampleArray, "app"));

         System.out.println("+9. Напишите метод, который принимает массив строк и возвращает количество строк, которые начинаются с заданной буквы: " + countStringsStartingWith(exampleArray, 'c'));

         System.out.println("10. Напишите метод, который принимает массив строк и возвращает массив строк в верхнем регистре: " + Arrays.toString(convertToUpperCase(exampleArray)));
    }
}
