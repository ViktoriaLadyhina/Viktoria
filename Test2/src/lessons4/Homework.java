package lessons4;

import java.util.Locale;

public class Homework {

    public static void main(String[] args) {

        System.out.println("1. Создайте строку через new - I study Basic Java");
        String str = "I study Basic Java!";

        System.out.println("2. Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1");
        System.out.println(str);

        System.out.println("3. Распечатать последний символ строки. Используем метод String.charAt().");
        char result;
        result = str.charAt(str.length() - 1);
        System.out.println(result);

        System.out.println("4. Проверить, содержит ли ваша строка подстроку “Java”.");
        // Используем метод String.contains().
        System.out.println(str.contains("Java"));

        System.out.println("5. Заменить все символы “а” на “о”.");
        String newStr = str.replace('a', 'o');
        System.out.println(newStr);

        System.out.println("6. Преобразуйте строку к верхнему регистру.");
        System.out.println(str.toUpperCase(Locale.ENGLISH));

        System.out.println("7. Преобразуйте строку к нижнему регистру.");
        System.out.println(str.toLowerCase());

        System.out.println("8. Вырезать строку Java c помощью метода String.substring().");
        System.out.println(str.substring(0, 14));
        System.out.println(str.substring(14));





    }

}
