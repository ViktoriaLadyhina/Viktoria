package hw_191224;

import java.util.Arrays;

public class T12 {

// 1. Напишите метод, который принимает массив целых чисел и массив строк, и возвращает их длины как массив из двух элементов.
    public static int[] getArrayLengths(int[] intArray, String[] stringArray) {
        int[] lenght = {intArray.length, stringArray.length};
        return lenght;
    }

// 2. Напишите метод, который принимает массив строк и массив символов, и возвращает массив строк, каждая из которых начинается с соответствующего символа.
    public static String[] filterStringsByChar(String[] stringArray, char[] charArray) {
        String[] str = new String[stringArray.length];
        int index = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (i == j){
                    str[index] = charArray[j] + stringArray[i];
                    index++;
                }
            }
        }
        return str;
    }

// 3. Напишите метод, который принимает массив целых чисел и массив логических значений, и возвращает сумму всех чисел, соответствующих true в логическом массиве.
    public static int sumMatchingTrue(int[] intArray, boolean[] booleanArray) {
        int n = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < booleanArray.length; j++) {
                if (i == j && booleanArray[i]){
                    n = n + intArray[i];
                }
            }
        }
        return n;
    }

// 4. Напишите метод, который принимает массив строк и массив целых чисел, и возвращает строку с самой большой длиной, если она длиннее, чем соответствующее число.
    public static String getLongestStringIfLonger(String[] stringArray, int[] intArray) {
        int leng;
        int maxLeng = 0;
        String result = "";
        for (int i = 0; i < stringArray.length; i++) {
            leng = stringArray[i].length();
            for (int j = 0; j < intArray.length; j++) {
                if (leng > maxLeng){
                    maxLeng = leng;
                    result = stringArray[i];
                }
            }
        }
        return result;
    }

// 5. Напишите метод, который принимает массив символов и массив целых чисел, и возвращает массив символов, дублированных на значение из целого массива.
    public static char[] duplicateCharsByNumbers(char[] charArray, int[] intArray) {
        // TODO: реализовать метод
        return new char[0];
    }

// 6. Напишите метод, который принимает массив логических значений и массив строк, и возвращает массив строк, соответствующих true.
    public static String[] getStringsMatchingTrue(boolean[] booleanArray, String[] stringArray) {
        int count = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < booleanArray.length; j++) {
                if (i == j && booleanArray[i]){
                    count++;
                }
            }
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < booleanArray.length; j++) {
                if (i == j && booleanArray[i]){
                    result[index] = stringArray[i];
                    index++;
                }
            }
        }
        return result;
    }

// 7. Напишите метод, который принимает массив целых чисел и массив символов, и возвращает массив символов, соответствующих четным числам.
    public static char[] getCharsForEvenNumbers(int[] intArray, char[] charArray) {
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0){
                count++;
            }
        }
        char[] ch = new char[count];
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (i == j && intArray[i] % 2 == 0){
                    ch[index] = charArray[i];
                    index++;
                }
            }
        }
        return ch;
    }

// 8. Напишите метод, который принимает два массива строк и возвращает массив строк, где каждый элемент — это конкатенация строк с одинаковыми индексами из обоих массивов.
    public static String[] concatenateStringArrays(String[] array1, String[] array2) {
        String[] result = new String[array1.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (i == j){
                    result[index] = array1[i] + " " +  array2[j];
                    index++;
                }
            }

        }
        return result;
    }

// 9. Напишите метод, который принимает массив целых чисел и массив логических значений, и
// возвращает true, если хотя бы одно число больше 10 и соответствует true.
    public static boolean hasNumberGreaterThan10MatchingTrue(int[] intArray, boolean[] booleanArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < booleanArray.length; j++) {
                if (i == j && intArray[i] > 10 && booleanArray[j]){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 10. Напишите метод, который принимает массив строк и массив символов, и возвращает массив строк, содержащих соответствующий символ.
     */
    public static String[] getStringsContainingChar(String[] stringArray, char[] charArray) {
        // TODO: реализовать метод
        return new String[0];
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 15};
        System.out.println(Arrays.toString(intArray));
        String[] stringArray = {"one", "two", "three", "ccc", "dd"};
        System.out.println(Arrays.toString(stringArray));
        String[] stringArray2 = {"one2", "two2", "three2", "ccc2", "dd2"};
        System.out.println(Arrays.toString(stringArray2));
        char[] ch = {'a', 'b', 'd', 'c', 'e'};
        System.out.println(ch);
        boolean[] bool = {true, false, true, false, true};
        System.out.println(Arrays.toString(bool));
        System.out.println("---------");

        System.out.println("1. целых чисел и массив строк, и возвращает их длины как массив из двух элементов: " + Arrays.toString(getArrayLengths(intArray, stringArray)));
        System.out.println("2. строк и массив символов, и возвращает массив строк, каждая из которых начинается с соответствующего символа: " + Arrays.toString(filterStringsByChar(stringArray, ch)));
        System.out.println("3. целых чисел и массив логических значений, и возвращает сумму всех чисел, соответствующих true в логическом массиве: " + sumMatchingTrue(intArray, bool));
        System.out.println("4. строк и массив целых чисел, и возвращает строку с самой большой длиной, если она длиннее, чем соответствующее число: " + getLongestStringIfLonger(stringArray, intArray));
        System.out.println("6. логических значений и массив строк, и возвращает массив строк, соответствующих true: " + Arrays.toString(getStringsMatchingTrue(bool, stringArray)));
        System.out.println("7. целых чисел и массив символов, и возвращает массив символов, соответствующих четным числам: " + Arrays.toString(getCharsForEvenNumbers(intArray, ch)));
        System.out.println("8. два массива строк и возвращает массив строк, где каждый элемент — это конкатенация строк с одинаковыми индексами из обоих массивов: " + Arrays.toString(concatenateStringArrays(stringArray, stringArray2)));
        System.out.println("9. целых чисел и массив логических значений, и возвращает true, если хотя бы одно число больше 10 и соответствует true: " + hasNumberGreaterThan10MatchingTrue(intArray, bool));
    }
}
