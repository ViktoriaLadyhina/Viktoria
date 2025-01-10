package hw_191224;

import java.util.Arrays;

public class T13 {

// 1. Напишите метод, который принимает массив целых чисел и массив строк, и выводит элементы двух массивов построчно.
    public static String printArrays(int[] intArray, String[] strArray) {
        String n = "";
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        for (int j = 0; j < strArray.length; j++) {
            System.out.println(strArray[j]);
        }
        return n;
    }

// 2. Напишите метод, который принимает массив целых чисел и массив строк, и возвращает массив строк с добавлением соответствующего числа к каждой строке.
    public static String[] appendNumbersToStrings(int[] intArray, String[] strArray) {
        String[] str = new String[strArray.length];
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                if (i == j) {
                    str[index] = strArray[j] + intArray[i];
                    index++;
                }
            }
        }
        return str;
    }

// 3. Напишите метод, который принимает массив целых чисел и массив логических значений, и возвращает количество true для чисел, больших 10.
    public static int countTrueForLargeNumbers(int[] intArray, boolean[] boolArray) {
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < boolArray.length; j++) {
                if (i == j && intArray[i] > 10 && boolArray[i]){
                    count++;
                }
            }
        }
        return count;
    }

// 4. Напишите метод, который принимает массив строк и массив символов, и возвращает массив строк, где к каждой строке добавлен соответствующий символ.
    public static String[] concatenateStringAndChar(String[] strArray, char[] charArray) {
        String[] str = new String[strArray.length];
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                if (i == j) {
                    str[index] = strArray[j] + charArray[i];
                    index++;
                }
            }
        }
        return str;
    }

// 5. Напишите метод, который принимает массив строк и массив целых чисел, и
// возвращает сумму длин всех строк, умноженных на соответствующее число.
    public static int sumStringLengthsTimesNumbers(String[] strArray, int[] intArray) {
        int result = 0;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if (i == j){
                    result = result + (strArray[i].length() * intArray[j]);
                }
            }

        }
        return result;
    }

// 6. Напишите метод, который принимает массив целых чисел и массив строк, и
// возвращает true, если длина строки равна соответствующему числу.
    public static boolean areStringLengthsEqualToNumbers(String[] strArray, int[] intArray) {
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if (i == j && strArray[i].length() == intArray[j]){
                    return true;
                }
            }
        }
        return false;
    }

// 7. Напишите метод, который принимает массив символов и массив строк,
// и возвращает количество строк, начинающихся с соответствующего символа.

    public static int countStringsStartingWithChar(String[] strArray, char[] charArray) {
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                for (int k = 0; k < strArray[i].length(); k++) {
                    if(i == j && strArray[i].charAt(k) == charArray[j]){
                        count++;
                    }
                }
            }
        }
        return count;
    }

// 8. Напишите метод, который принимает массив целых чисел и массив логических значений, и
// возвращает массив чисел, если соответствующее значение в логическом массиве равно true.
    public static int[] filterNumbersByBoolean(int[] intArray, boolean[] boolArray) {
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < boolArray.length; j++) {
                if (i == j && boolArray[j]){
                    count++;
                }
            }
        }
        int[] n = new int[count];
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < boolArray.length; j++) {
                if (i == j && boolArray[j]){
                    n[index] = intArray[i];
                    index++;
                }
            }
        }
        return n;
    }

    /**
     * 9. Напишите метод, который принимает два массива строк, и
     * возвращает массив, содержащий строки из первого массива, которых нет во втором.
     */
    public static String[] findUniqueStrings(String[] array1, String[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(i == j && !array1[i].equals(array2[j])){
                    count++;
                    break;
                }
            }
        }
        String[] n = new String[count];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(i == j && !array1[i].equals(array2[j])){
                    n[index] = array1[i];
                    index++;
                    break;
                }
            }
        }
        return n;
    }

// 10. Напишите метод, который принимает массив целых чисел и массив строк, и
// возвращает строку, составленную из строк, повторенных число раз, равное соответствующему числу.

    public static String repeatStringsByNumbers(String[] strArray, int[] intArray) {
        String result = "";
        for (int i = 0; i < intArray.length; i++) {
            int count = intArray[i];

            for (int j = 0; j < strArray.length; j++) {
                String tmp = strArray[j];
                for (int k = 0; k < count; k++) {
                    result += tmp;
                }
            }
            // для добавления запятой и пробелов между строк
            if(i < intArray.length-1){
                result += (", ");
            }
        }
        return result;
    }

    public static void main(String[] args) {
         int[] intArray = {1, 2, 3, 11};
         String[] strArray = {"ak", "bol", "cat", "digit"};
         String[] strArray2 = {"ak", "bol", "digit"};
         boolean[] bool = {true, false, true, true};
         char[] ch = {'a', 'b', 'd', 'c'};

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(strArray2));
        System.out.println(Arrays.toString(bool));
        System.out.println(ch);
        System.out.println("-----------");

        System.out.println("1. выводит элементы двух массивов построчно: ");
        System.out.println(printArrays(intArray, strArray));
        System.out.println("2. возвращает массив строк с добавлением соответствующего числа к каждой строке: " + Arrays.toString(appendNumbersToStrings(intArray, strArray)));
        System.out.println("3. возвращает количество true для чисел, больших 10: " + countTrueForLargeNumbers(intArray, bool));
        System.out.println("4. возвращает массив строк, где к каждой строке добавлен соответствующий символ: " + Arrays.toString(concatenateStringAndChar(strArray, ch)));
        System.out.println("5. возвращает сумму длин всех строк, умноженных на соответствующее число: " + sumStringLengthsTimesNumbers(strArray, intArray));
        System.out.println("6. возвращает true, если длина строки равна соответствующему числу: " + areStringLengthsEqualToNumbers(strArray, intArray));
        System.out.println("7. возвращает количество строк, начинающихся с соответствующего символа: " + countStringsStartingWithChar(strArray, ch));
        System.out.println("8. возвращает массив чисел, если соответствующее значение в логическом массиве равно true: " + Arrays.toString(filterNumbersByBoolean(intArray, bool)));
        System.out.println("9. возвращает массив, содержащий строки из первого массива, которых нет во втором: " + Arrays.toString(findUniqueStrings(strArray, strArray2)));
        System.out.println("10. возвращает строку, составленную из строк, повторенных число раз, равное соответствующему числу: " + repeatStringsByNumbers(strArray, intArray));
    }
}
