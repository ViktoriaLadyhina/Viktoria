package hw_051224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_21_30 {

    public static void main(String[] args) {
        task21();
        System.out.println("--------------");
        task22();
        System.out.println("--------------");
        task23();
        System.out.println("--------------");
        task24();
        System.out.println("--------------");
        task25();
        System.out.println("--------------");
        task26();
        System.out.println("--------------");
        task27();
        System.out.println("--------------");
        task28();
        System.out.println("--------------");
        task29();
        System.out.println("--------------");
        task30();
        System.out.println("--------------");
    }

    // 21. Генерация нового массива из четных чисел.
    public static void task21() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("+21. Было: " + (Arrays.toString(array)));
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count++;
            }
        }
        int[] evenNumbers = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                evenNumbers[index] = array[i];
                index++;
            }
        }
        System.out.println("Генерация нового массива из четных чисел: " + Arrays.toString(evenNumbers));
    }

    // 22. Генерация нового массива из нечетных чисел.
    public static void task22() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("+22. Было: " + (Arrays.toString(array)));
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                count++;
            }
        }
        int[] oddNumbers = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                oddNumbers[index] = array[i];
                index++;
            }
        }
        System.out.println("Генерация нового массива из четных чисел: " + Arrays.toString(oddNumbers));
    }

    // 23. Проверка на палиндром в массиве строк.
    public static void task23() {
        String[] array = {"level", "hello", "radar", "world"};
        System.out.println("-23. Было: " + (Arrays.toString(array)));

//        boolean n = false;
//        for (int i = 0; i < array.length / 2; i++) {
//            if (array[i].charAt(i) == array[i].charAt(array.length) - i - 1){
//                n = true;
//                break;
//            }
//        }
//        System.out.println(n);
    }

    // 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
    public static void task24() {
        String[] array = {"apple", "application", "banana", "grape"};
        System.out.println("+24. Было: " + (Arrays.toString(array)));
        String pattern = "app";
        boolean n = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(pattern)){
                System.out.println("Поиск всех подстрок в строках массива, соответствующих заданному шаблону" + " (" + pattern + "): " + array[i]);
            }
        }
    }

    // 25. Создание массива чисел с четными индексами.
    public static void task25() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("+25. Было: " + (Arrays.toString(array)));
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                count++;
            }
        }
        int[] evenIndex = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                evenIndex[index] = array[i];
                index++;
            }
        }
        System.out.println("Создание массива чисел с четными индексами: " + Arrays.toString(evenIndex));
    }

    // 26. Создание массива чисел с нечетными индексами.
    public static void task26() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("+26. Было: " + (Arrays.toString(array)));

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                count++;
            }
        }
        int[] oddIndex = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                oddIndex[index] = array[i];
                index++;
            }
        }
        System.out.println("Создание массива чисел с нечетными индексами: " + Arrays.toString(oddIndex));
    }

    // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
    public static void task27() {
        String[] array = {"apple", "banana", "cat", "dog", "elephant"};
        System.out.println("+27. Было: " + (Arrays.toString(array)));

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() % 2 == 0){
                count++;
            }
        }
        String[] evenLight = new String[count];
        String[] oddLight = new String[array.length - count];
        int indexEven = 0;
        int indexOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() % 2 == 0){
                evenLight[indexEven] = array[i];
                indexEven++;
            }else {
                oddLight[indexOdd] = array[i];
                indexOdd++;
            }
        }
        System.out.println("Строки с четной длиной: " + Arrays.toString(evenLight));
        System.out.println("Строки с нечетной длиной: " + Arrays.toString(oddLight));
    }

    // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
    public static void task28() {
        String[] array = {"apple", "banana", "level", "radar", "hello"};
        System.out.println("+28. Было: " + (Arrays.toString(array)));

        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == array[i].charAt(array[i].length()-1)){
                System.out.println("Найти все строки, которые начинаются и заканчиваются одинаковой буквой: " + array[i]);
            }
        }
    }

    // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
    public static void task29() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("+29. Было: " + (Arrays.toString(array)));
        int[] square = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            square[i] = array[i] * array[i];
        } System.out.println("Создать массив чисел, которые являются квадратами элементов исходного массива: " + Arrays.toString(square));
    }

    // 30. Создать массив строк, содержащих только уникальные символы.
    public static void task30() {
        String[] array = {"apple", "banana", "cat", "dog", "race"};
        System.out.println("-30. Было: " + (Arrays.toString(array)));


//        String[] uniqueSymbols = new String[array.length];
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i].charAt(i) == array[j].charAt(j) && j != i) {
//                    uniqueSymbols[index] = array[i];
//                    index++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(uniqueSymbols));
    }

}
