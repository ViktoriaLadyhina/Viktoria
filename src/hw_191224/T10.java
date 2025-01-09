package hw_191224;

import java.util.Arrays;

public class T10 {
    public class BooleanArrayTasks {

// 1. Напишите метод, который принимает массив логических значений и возвращает количество значений true.
        public static int countTrue(boolean[] array) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i] == true){
                    count++;
                }
            }
            return count;
        }

// 2. Напишите метод, который принимает массив логических значений и возвращает true, если все элементы равны true.
        public static boolean areAllTrue(boolean[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == true){
                    return true;
                }
            }
            return false;
        }

        /**
         * 3. Напишите метод, который принимает массив логических значений и возвращает true, если хотя бы один элемент равен true.
         */
        public static boolean containsTrue(boolean[] array) {
            // TODO: реализовать метод
            return false;
        }

        /**
         * 4. Напишите метод, который принимает массив логических значений и возвращает массив с противоположными значениями.
         */
        public static boolean[] invertArray(boolean[] array) {
            // TODO: реализовать метод
            return new boolean[0];
        }

        /**
         * 5. Напишите метод, который принимает массив логических значений и возвращает количество значений false.
         */
        public static int countFalse(boolean[] array) {
            // TODO: реализовать метод
            return 0;
        }

        /**
         * 6. Напишите метод, который принимает два массива логических значений и возвращает их логическое И (AND) поэлементно.
         */
        public static boolean[] andArrays(boolean[] array1, boolean[] array2) {
            // TODO: реализовать метод
            return new boolean[0];
        }

        /**
         * 7. Напишите метод, который принимает два массива логических значений и возвращает их логическое ИЛИ (OR) поэлементно.
         */
        public static boolean[] orArrays(boolean[] array1, boolean[] array2) {
            // TODO: реализовать метод
            return new boolean[0];
        }

        /**
         * 8. Напишите метод, который принимает массив логических значений и возвращает true, если количество значений true больше, чем false.
         */
        public static boolean moreTrueThanFalse(boolean[] array) {
            // TODO: реализовать метод
            return false;
        }

        /**
         * 9. Напишите метод, который принимает массив логических значений и возвращает индекс первого значения true.
         */
        public static int firstTrueIndex(boolean[] array) {
            // TODO: реализовать метод
            return -1;
        }

        /**
         * 10. Напишите метод, который принимает массив логических значений и возвращает true, если массив симметричен (палиндром).
         */
        public static boolean isSymmetric(boolean[] array) {
            // TODO: реализовать метод
            return false;
        }

        public static void main(String[] args) {
             boolean[] exampleArray = {true, false, true, false, true};
            System.out.println(Arrays.toString(exampleArray));
            System.out.println("--------------");

            System.out.println("1. Напишите метод, который принимает массив логических значений и возвращает количество значений true: " + countTrue(exampleArray));
            System.out.println("2. Напишите метод, который принимает массив логических значений и возвращает true, если все элементы равны true: " + areAllTrue(exampleArray));
        }
    }
}