package lesson5;

// Создайте класс Кот
// Создайте конструктор по умолчанию
// Создайте класс Тест
// Создайте экземпляр класса Кот (создали в Test.java)
// Добавьте в класс Кот два конструктора с параметрами
// Удалите конструктор по умолчанию
// Удалите this из конструктора, переименуйте параметры - выдает ошибку

public class Cat {
    int age;
    String name;

// Добавьте в класс Кот два конструктора с параметрами
    Cat(int age, String name){
        this.age = age;
        this.name = name;
    }
    Cat(String name){
       this.name = name;
    }
    Cat(){

//    @Override
//    public String toString() {
//    return "Kitty{" +
//          "age=" + age +
//          ", name='" + name + '\'' +
//    '}';

    }
}
