package lesson7;


import java.util.Random;

public class Metod {


    Random numb1 = new Random();

// Задача 1
    public int getRandomStudent(int quantity){
        return numb1.nextInt(2, quantity);
    }
// Задача 2
//    private int a;
//    private int b;
    private int temp;
    public void get(int a, int b) {
        temp = a;  // Сохраняем значение a во временной переменной
        a = b;     // Присваиваем b переменной a
        b = temp;  // Присваиваем временное значение переменной b
        System.out.println(a);
        System.out.println(b);
    }
}
