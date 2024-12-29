package hw_051224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_1_10 {

    public static void main(String[] args) {

        task1();
        System.out.println("------------------");
        task2();
        System.out.println("------------------");
        task3();
        System.out.println("------------------");
        task4();
        System.out.println("------------------");
        task5();
        System.out.println("------------------");
        task6();
        System.out.println("------------------");
        task7();
        System.out.println("------------------");
        task8();
        System.out.println("------------------");
        task9();
        System.out.println("------------------");
        task10();
    }

    // 1. Найти сумму элементов массива целых чисел.
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        System.out.println("+1. Было: " + (Arrays.toString(array)));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Найти сумму элементов массива целых чисел: " + sum);
    }

    // 2. Найти длину самой длинной строки в массиве строк.
    public static void task2() {
        String[] array = {"cat", "elephant", "dog"};
        System.out.println("+2. Было: " + (Arrays.toString(array)));
        int maxLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxLength){
                maxLength = array[i].length();
            }
        }
        System.out.println("Найти длину самой длинной строки в массиве строк: " + maxLength);
    }

    // 3. Проверить, содержит ли массив строк заданное слово.
    public static void task3() {
        String[] array = {"apple", "banana", "cherry"};
        System.out.println("+3. Было: " + (Arrays.toString(array)));
        String target = "banana";
        boolean givNumber = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)){ // сравнение
                givNumber = true;
                break;
            }
        }
        System.out.println("Проверить, содержит ли массив строк заданное слово: " + givNumber);
    }

    // 4. Подсчитать количество строк, содержащих заданный символ.
    public static void task4() {
        String[] array = {"apple", "banana", "cherry"};
        System.out.println("+4. Было: " + (Arrays.toString(array)));
        char target = 'a';
        int cuont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("a")){
                cuont++;
            }
        }
        System.out.println("Подсчитать количество строк, содержащих заданный символ: " + cuont);
    }

    // 5. Найти строку с максимальным количеством символов 'e'.
    public static void task5() {
        String[] array = {"elephant", "eagle", "dog"};
        System.out.println("+5. Было: " + (Arrays.toString(array)));
        String maxString = "";
        int maxCount = 0;
        int count = 0;
        char target = 'e';

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == target){
                    count++;
                }
                if (count > maxCount){
                    maxCount = count;
                    maxString = array[i];
                }
            }
        }
        System.out.println("Найти строку с максимальным количеством символов 'e': " + maxString);
    }


    // 6. Удалить из массива строк все строки, содержащие заданное слово.
    public static void task6() {
        String[] array = {"apple pie", "banana bread", "cherry tart"};
        System.out.println("+6. Было: " + (Arrays.toString(array)));
        String target = "bread";
        String del = "";
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(target)){
                del = array[i];
                count++;
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(array)); // преобразование массива в лист через метод
        list.remove(del);

        String[] array2;
        array2 = new String[array.length - count]; // создание нового массива с длиной меньшей, чем было в старом
        list.toArray(array2); // преобразование листа в новый массив
        System.out.println("Удалить из массива строк все строки, содержащие заданное слово: " + Arrays.toString(array2));
    }

    // 7. Найти минимальный элемент массива целых чисел.
    public static void task7() {
        int[] array = {3, 1, 4, 1, 5};
        System.out.println("+7. Было: " + (Arrays.toString(array)));

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Найти минимальный элемент массива целых чисел: " + min);
    }

    // 8. Найти строку с минимальной длиной.
    public static void task8() {
        String[] array = {"cats", "elephant", "dog"};
        System.out.println("+8. Было: " + (Arrays.toString(array)));
        String minString = array[0];
        int minLength = minString.length();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < minLength){
                minLength = array[i].length();
                minString = array[i];
            }
        }
        System.out.println("Найти строку с минимальной длиной: " + minString + ", где количество символов - " + minLength);
    }

    // 9. Подсчитать количество четных чисел в массиве.
    public static void task9() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("+9. Было: " + (Arrays.toString(array)));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Подсчитать количество четных чисел в массиве: " + count);
    }

    // 10. Найти строку, которая встречается чаще всего.
    public static void task10() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana", "banana"};
        System.out.println("+10. Было: " + (Arrays.toString(array)));
        String mostFrequent = "";
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            int curCount = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j]) && j != i){
                    curCount++;
                }
            }
            if (curCount > maxCount){
                maxCount = curCount;
                mostFrequent = array[i];
            }
        }
        System.out.println("Найти строку, которая встречается чаще всего: строка " + mostFrequent + " встречается " + maxCount + " раза");
    }
}