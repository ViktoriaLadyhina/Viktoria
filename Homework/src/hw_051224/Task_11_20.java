package hw_051224;

import java.util.*;

public class Task_11_20 {

    public static void main(String[] args) {
        System.out.println("---------------");
task11();
        System.out.println("---------------");
task12();
        System.out.println("---------------");
task13();
        System.out.println("---------------");
task14();
        System.out.println("---------------");
task15();
        System.out.println("---------------");
task16();
        System.out.println("---------------");
task17();
        System.out.println("---------------");
task18();
        System.out.println("---------------");
task19();
        System.out.println("---------------");
task20();
    }

    // 11. Отсортировать массив строк по длине.
    public static void task11() {
        String[] array = {"elephant", "cat", "dog"};
        System.out.println("+11. Было: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() > array[j].length()) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Отсортировать массив строк по длине: " + Arrays.toString(array));
    }

    // 12. Найти и вывести все строки одинаковой длины.
    public static void task12() {
        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
        System.out.println("+12. Было: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() == array[j].length()) {
                    System.out.println("Строки одинаковой длины: " + array[i] + " и " + array[j]);
                }
            }
        }
    }

    // 13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean compareontents = true;
        System.out.println("+13. Было: " + Arrays.toString(array1));
        System.out.println("+13. Было: " + Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]){
                    compareontents = false;
                    break;
            }
        }
        System.out.println("Сравнить содержимое двух массивов целых чисел: " + compareontents);
    }

    // 14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println("+14. Было: " + Arrays.toString(array1));
        System.out.println("+14. Было: " + Arrays.toString(array2));
        int[] sumArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        System.out.println("Генерация нового массива из сумм элементов двух массивов: " + Arrays.toString(sumArray));
    }

    // 15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
        System.out.println("+15. Было: " + Arrays.toString(array));
        boolean dubl;
        for (int i = 0; i < array.length; i++) {
        dubl = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j]) && (i != j)){
                    dubl = false;
                    break;
                }
            }
            if (dubl){
                System.out.println("Найти уникальные значения в массиве строк: " + array[i]);
            }
        }
    }

    // 16. Удалить дубликаты из массива строк.
    public static void task16() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
        System.out.println("+16. Было: " + Arrays.toString(array));

        String[] arr = new String[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean dubl = false;
            for (int j = 0; j < count; j++) {
                if (array[i].equals(arr[j])){
                    dubl = true;
                    break;
                }
            }
            if (!dubl){
                arr[count++] = array[i];
            }
        }
        String[] array3 = Arrays.copyOf(arr, count);
        System.out.println("Удалить дубликаты из массива строк: " + Arrays.toString(array3));
    }

    // 17. Объединить два массива строк в один.
    public static void task17() {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};
        System.out.println("+17. Было: " + Arrays.toString(array1) + " и " + Arrays.toString(array2));

        String[] comArray = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, comArray, 0, 2);
        System.arraycopy(array2, 0, comArray, 2, 2);
//        System.arrayCopy(from, fromIndex, to, toIndex, count);
//        from - массив, который копируем
//        to - массив в которой копируем
//        fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
//        toIndex - индекс в массиве to начиная с которого вставляем элементы
//        count - количество элементов которые берем из массива from и вставляем в массив to
//        Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.
        System.out.println("Объединить два массива строк в один: " + Arrays.toString(comArray));
    }

    // 18. Проверить, упорядочен ли массив строк по алфавиту.
    public static void task18() {
        String[] array = {"apple", "banana", "cherry"};
        System.out.println("+18. Было: " + Arrays.toString(array));
        boolean sort = true;
        for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                sort = false;
                }
        }
        System.out.println("Проверить, упорядочен ли массив строк по алфавиту: " + sort);
    }

    // 19. Найти строки, начинающиеся с заданной буквы.
    public static void task19() {
        String[] array = {"apple", "banana", "apricot", "cherry"};
        System.out.println("+19. Было: " + Arrays.toString(array));
        char target = 'a';
        String targetStr = String.valueOf(target);

        for (int i = 0; i < array.length; i++) {
                if (array[i].startsWith(targetStr)){
                    System.out.println(array[i]);
            }
        }
    }

    // 20. Создать массив строк из первых букв элементов другого массива.
    public static void task20() {
        String[] array = {"apple", "banana", "cherry"};
        System.out.println("+20. Было: " + Arrays.toString(array));
        String[] firstLetter = new String[3];

        for (int i = 0; i < array.length; i++) {
            firstLetter[i] = String.valueOf(array[i].charAt(0));
        }
        System.out.println(Arrays.toString(firstLetter));
    }

}
