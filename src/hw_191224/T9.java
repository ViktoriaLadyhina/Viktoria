package hw_191224;

import java.util.Arrays;

public class T9 {

// 1. Напишите метод, который принимает массив символов и возвращает массив уникальных символов.
    public static char[] getUniqueCharacters(char[] array) {
        int count = 0;
        char[] arr = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            boolean dubl = true;
            for (int j = 0; j < count; j++) {
                if(array[i] == array[j]){
                    dubl = false;
                    break;
                }
            }
            if (dubl){
                arr[count] = array[i];
                count++;
            }
        }
        char[] unic = new char[count];
        for (int i = 0; i < count; i++) {
            unic[i] = arr[i];
        }
        return unic;
    }

// 2. Напишите метод, который принимает массив символов и возвращает количество согласных букв.
    public static int countConsonants(char[] array) {
        int consCount = 0;
        char[] cons = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < cons.length; j++) {
                if (array[i] == cons[j]) {
                    consCount++;
                }
            }
        }
        return consCount;
    }

    /**
     * 3. Напишите метод, который принимает массив символов и возвращает массив символов без пробелов.
     */
    public static char[] removeSpaces(char[] array) {
        // TODO: реализовать метод
        return new char[0];
    }

    /**
     * 4. Напишите метод, который принимает массив символов и возвращает массив, содержащий только буквы.
     */
    public static char[] filterLetters(char[] array) {
        // TODO: реализовать метод
        return new char[0];
    }

    /**
     * 5. Напишите метод, который принимает массив символов и возвращает самое часто встречающееся значение.
     */
    public static char findMostFrequentChar(char[] array) {
        // TODO: реализовать метод
        return ' ';
    }

    /**
     * 6. Напишите метод, который принимает массив символов и возвращает массив, где каждый символ увеличен на 1 в ASCII-коде.
     */
    public static char[] shiftCharactersByOne(char[] array) {
        // TODO: реализовать метод
        return new char[0];
    }

// 7. Напишите метод, который принимает два массива символов и возвращает их объединение в один массив.
    public static char[] mergeCharArrays(char[] array1, char[] array2) {
        char[] n = new char[array1.length + array2.length];
        System.arraycopy(array1, 0, n, 0, array1.length);
        System.arraycopy(array2, 0, n, array1.length, array2.length);
        return n;
    }

    /**
     * 8. Напишите метод, который принимает массив символов и возвращает true, если все символы являются буквами.
     */
    public static boolean areAllLetters(char[] array) {
        // TODO: реализовать метод
        return false;
    }

// 9. Напишите метод, который принимает массив символов и возвращает строку, составленную из символов массива.
    public static String convertToString(char[] array) {
        String n = "";
        for (int i = 0; i < array.length; i++) {
            n = n + array[i];
        }
        return n;
    }

// 10. Напишите метод, который принимает массив символов и возвращает массив, в котором дубликаты заменены на символ '_'.
    public static char[] replaceDuplicatesWithUnderscore(char[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]){
                    array[i] = '_';
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
         char[] exampleArray = {'a', 'b', 'c', 'a', ' ', 'd', '1'};
        char[] exampleArray2 = {'a', 'b', 'c', 'a', ' ', 'd', '1'};
        System.out.println(exampleArray);
        System.out.println(exampleArray2);
        System.out.println("-------------");

        System.out.println("1. Напишите метод, который принимает массив символов и возвращает массив уникальных символов: " + Arrays.toString(getUniqueCharacters(exampleArray)));
        System.out.println("2. Напишите метод, который принимает массив символов и возвращает количество согласных букв: " + countConsonants(exampleArray));
        System.out.println("7. Напишите метод, который принимает два массива символов и возвращает их объединение в один массив: " + Arrays.toString(mergeCharArrays(exampleArray, exampleArray2)));
        System.out.println("9. Напишите метод, который принимает массив символов и возвращает строку, составленную из символов массива: " + convertToString(exampleArray));
        System.out.println("10. Напишите метод, который принимает массив символов и возвращает массив, в котором дубликаты заменены на символ '_': " + Arrays.toString(replaceDuplicatesWithUnderscore(exampleArray)));
    }
}
