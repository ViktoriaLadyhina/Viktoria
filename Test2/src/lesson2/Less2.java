package lesson2;
// в каком пакете хранится класс

// public - можно стереть, для использования в других страницах
public class Less2 {
    // класс, в котором мы работаем

    int x = 5;
    // объявляем тип данных - int (простое число), integer2 - название, после = присвоение значение
    float fl = 0.5F;
    // F - указывает на флотное число, с плавающей запятой

    Float float1;
    // Float - это класс, число с запятой - равно 0
    String string;
    // строчные значения

    int getInt(){
        return x;
    }
    // int - класс обертка, getInt - название метода. Объявляем метод, который вохвращает число int
}
