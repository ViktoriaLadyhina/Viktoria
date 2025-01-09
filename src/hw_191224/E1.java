package hw_191224;

import java.util.Arrays;

public class E1 {

// 1. Напишите метод, который принимает два массива строк одинаковой длины и возвращает массив, содержащий строки, составленные из соответствующих строк двух массивов в обратном порядке.

// 2. Напишите метод, который принимает массив целых чисел и массив строк, и возвращает количество строк, чья длина больше, чем соответствующее число в массиве чисел.
public static void dolenghtStr(String[] array1, int[] array2) {
    for (int i = 0; i < array1.length; i++) {
        for (int j = 0; j < array2.length; j++) {
            if(i == j && array1[i].length() == array2[i]){
                System.out.println(array1[i]);
            }
        }
    }
}

/**
 * 3. Напишите метод, который принимает массив символов и массив строк,
 * и возвращает массив, где строки содержат только символы из соответствующего элемента массива символов.
 */

// 4. Напишите метод, который принимает два массива целых чисел одинаковой длины и возвращает массив, содержащий разность квадратов соответствующих чисел.
public static int[] dosquareOfNumbers(int[] array1, int[] array2) {
    int[] qw = new int[array1.length];
    int index = 0;
    for (int i = 0; i < array1.length; i++) {
        int tmp1 = array1[i] * array1[i];
        for (int j = 0; j < array2.length; j++) {
            int tmp2 = array2[j] * array2[j];
                if (i == j){
                qw[index] = tmp1 - tmp2;
                index++;
                }
        }
    }
    return qw;
    }

/**
 * 5. Напишите метод, который принимает массив логических значений и массив строк,
 * и возвращает массив строк, где каждое значение true добавляет "(valid)" к соответствующей строке.
 */

// 6. Напишите метод, который принимает два массива строк одинаковой длины и возвращает массив строк, где каждая строка — это объединение строк из обоих массивов с добавлением их длин.
public static String[] makeConcatenationOfTwoStrAndAddTheLength(String[] array1, String[] array2) {
    String[] twoStr = new String[array1.length];
    int index = 0;

    for (int i = 0; i < array1.length; i++) {
        for (int j = 0; j < array2.length; j++) {
            if (i == j){
                int lenght = array1[i].length() + array2[j].length();
                twoStr[index] = array1[i] + " " + array2[i] + " - " + lenght;
                index++;
            }
        }
    }
    return twoStr;
}

// 7. Напишите метод, который принимает массив чисел с плавающей точкой и массив целых чисел, и возвращает массив, содержащий произведения соответствующих элементов.
public static double[] doMultiplicationOfNumbersOfTwoArrays(double[] arr1, int[] arr2){
    double[] mult = new double[arr1.length];
    int index = 0;
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (i == j){
                mult[index] = arr1[i] * arr2[j];
                index++;
            }
        }
    }
    return mult;
}

// 8. Напишите метод, который принимает два массива символов и возвращает массив символов, которые присутствуют в обоих массивах.
public static char[] makeAUnionOfTwoArraysOfChars(char[] ch1, char[] ch2){
    int count = 0;
    for (int i = 0; i < ch1.length; i++) {
        for (int j = 0; j < ch2.length; j++) {
            if(ch1[i] == ch2[j]){
                count++;
            }
        }
    }
    char[] union = new char[count];
    int index = 0;
    for (int i = 0; i < ch1.length; i++) {
        for (int j = 0; j < ch2.length; j++) {
            if(ch1[i] == ch2[j]){
                union[index] = ch1[i];
                index++;
            }
        }
    }
    return union;
}

// 9. Напишите метод, который принимает массив строк и массив чисел, и возвращает true, если все строки массива имеют длину, равную соответствующему числу.
public static boolean compareStringLength (String[] array, int[] arr){
    boolean n = true;
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            if (i == j && array[i].length() != arr[j]){
                n = false;
                break;
            }
        }
    }
    return n;
}

// 10. Напишите метод, который принимает два массива строк и возвращает строку, содержащую чередующиеся элементы из двух массивов.
    public static String makeAConcatenationOfTwoStringArrays(String[] array1, String[] array2){
        String n = "";
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(i == j){
                    n = n + array1[i] + " " + array2[j] + ", ";
                }
            }
        }
        return n;
    }


public static void main(String[] args) {
    String[] str1 = {"kaffee", "latte", "americano"};
    System.out.println("Массив строк 1 " + Arrays.toString(str1));
    String[] str2 = {"apple", "banana", "cherry"};
    System.out.println("Массив строк 2 " + Arrays.toString(str2));
    int[] arr1 = {8, 5, 10};
    System.out.println("Массив чисел 1 " + Arrays.toString(arr1));
    int[] arr2 = {1, 6, 5};
    System.out.println("Массив чисел 2 " + Arrays.toString(arr2));
    double[] doub1 = {18.0, 5.0, 2.2};
    System.out.println("Массив дробных чисел 1 " + Arrays.toString(doub1));
    char[] ch1 = {'a', 'b', 'c'};
    System.out.println("Массив чаров 1 " + Arrays.toString(ch1));
    char[] ch2 = {'a', 'b', 'd'};
    System.out.println("Массив чаров 2 " + Arrays.toString(ch2));
    System.out.println("-----------");

    System.out.print("2: ");
    dolenghtStr(str1, arr1);

    System.out.println("4: " + Arrays.toString(dosquareOfNumbers(arr1, arr2)));
    System.out.println("6: " + Arrays.toString(makeConcatenationOfTwoStrAndAddTheLength(str1, str2)));
    System.out.println("7: " + Arrays.toString(doMultiplicationOfNumbersOfTwoArrays(doub1, arr1)));
    System.out.println("8: " + Arrays.toString(makeAUnionOfTwoArraysOfChars(ch1, ch2)));
    System.out.println("9: " + compareStringLength(str1, arr1));
    System.out.println("10: " + makeAConcatenationOfTwoStringArrays(str1, str2));

}
}