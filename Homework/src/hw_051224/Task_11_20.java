package hw_051224;

import java.util.Arrays;

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
        System.out.println("-12. Было: " + Arrays.toString(array));
//        String samelength = "";
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i].length() == array[j].length()){
//                    count++;
//                    samelength = array[i];
//                }
//            }
//        }
//        System.out.println("Найти и вывести все строки одинаковой длины: " + samelength);
    }

    // 13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
    }

    // 14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
    }

    // 15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};

    }

    // 16. Удалить дубликаты из массива строк.
    public static void task16() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
    }

    // 17. Объединить два массива строк в один.
    public static void task17() {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};
    }

    // 18. Проверить, упорядочен ли массив строк по алфавиту.
    public static void task18() {
        String[] array = {"apple", "banana", "cherry"};
    }

    // 19. Найти строки, начинающиеся с заданной буквы.
    public static void task19() {
        String[] array = {"apple", "banana", "apricot", "cherry"};
        char target = 'a';
    }

    // 20. Создать массив строк из первых букв элементов другого массива.
    public static void task20() {
        String[] array = {"apple", "banana", "cherry"};
    }

}
