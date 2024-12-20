package hw_101224;

import java.util.Random;

public class CustomObject {

    int id; //– идентификатор объекта.
    double value; //– дробное значение.
    boolean isActive; //– статус активности.
    char symbol; //– символ.
    float weight; //– вес объекта.
    byte age; //– возраст объекта.
    short level; //– уровень объекта.

    public CustomObject(int id, double value, boolean isActive, char symbol, float weight, byte age, short level) {
        this.id = id;
        this.value = value;
        this.isActive = isActive;
        this.symbol = symbol;
        this.weight = weight;
        this.age = age;
        this.level = level;
    }


    @Override
    public String toString() {
        return "CustomObject {id = " + id + ", " +
                "value = " + value + ", " +
                "isActive = " + isActive + ", " +
                "symbol = " + symbol + ", " +
                "weight = " + weight + ", " +
                "age = " + age + ", " +
                "level = " + level + '}';
    }

    public static CustomObject[] generateObjects() {
        CustomObject[] customObjects = new CustomObject[20];
        Random rand = new Random();
        for (int i = 0; i < customObjects.length; i++) {
            customObjects[i] = new CustomObject(i + 1,
                    rand.nextDouble(0, 100),
                    rand.nextBoolean(),
                    (char)rand.nextInt(65, 89),
                    rand.nextFloat(1, 50),
                    (byte)rand.nextInt(0, 127),
                    (short)rand.nextInt(0, 32_767));
        }
        return customObjects;
    }

    public static void main(String[] args) {
        CustomObject[] customObjects =  CustomObject.generateObjects();
        for (int i = 0; i < customObjects.length; i++) {
            System.out.println("customObjects[" + i + "] = " + customObjects[i]);
        }
    }
}

