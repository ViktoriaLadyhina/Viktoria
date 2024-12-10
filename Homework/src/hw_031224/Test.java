package hw_031224;

public class Test {
    public static void main(String[] args) {
task1();
    }

//    Необходимо, чтоб программа выводила на экран вот такую последовательность:
//    7 14 21 28 35 42 49 56 63 70 77 84 91 98 и посчитать сумму.
    public static void task1() {
        int sum = 0;
        for (int i = 7; i <= 98; i = i+7) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println(sum);
    }




}
