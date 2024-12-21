package Sam_201224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] c = {3, 8, 4, 9, 3};

        a[1] = 5;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));

        boolean[] bool = new boolean[10];
        System.out.println(Arrays.toString(bool));

        String[] str = new String[10];
        System.out.println(Arrays.toString(str));

        Integer[] aOb = new Integer[10];
        aOb[1] = 5;
        System.out.println(Arrays.toString(aOb));

        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(1, 10);
        }
        System.out.println("Random: " + Arrays.toString(a));

        //удаляем элемент
        a[1] = 0; // для примитивного типа значение по default
        aOb[1] = null; // для ссылочного типа

        // Java
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 8, 4, 9, 3, 6, 3, 8, 9, 9));
        arrayList.remove(2);

        Object[] arr = arrayList.toArray();
        System.out.println("arr=" + arr.length);

        Integer[] arrInt = new Integer[10];
        arrayList.toArray(arrInt);
        System.out.println("arrInt=" + arrInt.length);
        System.out.println("arrInt = " + Arrays.toString(arrInt)); //распечатать содержимое массива
        System.out.println("--------------------");
        System.out.println("Массив а: " + Arrays.toString(a));
        int exist = rand.nextInt(1, 10);
        System.out.println("Алгоритм последовательного поиска заданного числа (" + exist + ") в массиве а (рандом): " + existNumber(a, exist));
        System.out.println("Алгоритм последовательного поиска заданного числа (" + exist + ") в массиве а (рандом) revers: " + existNumberRevers(a, exist));
        System.out.println("Сортировка пузырьком массива а (рандом): " + Arrays.toString(sortBabel(a)));
        System.out.println("Сортировка пузырьком массива а (рандом) в обратную сторону: " + Arrays.toString(sortBabelDeck(a)));

    }

    // алгоритм последовательного поиска:
    static boolean existNumber(int[] arr, int source) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == source) {
                return true;
            }
        }
        return false;
    }
    //алгоритм последовательного поиска revers
    static boolean existNumberRevers(int[] arr, int source) {
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] == source) {
                return true;
            }
        }
        return false;
    }

    // сортировка пузырьком:
    static int [] sortBabel (int[] arr) {
        boolean isSorted = false;
        int tmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }

    static int [] sortBabelDeck (int[] arr) {
        boolean isSorted = false;
        int tmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }
}
