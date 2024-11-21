package lessons4;

public class Lessons4 {
    public static void main(String[] args) {
//        int testNumber = 500;
//        int testNumber2 = 964;
//
//        System.out.println("1. int в long ----------------");
//        long testLongNumber = testNumber; // произвести int в long
//        long testLongNumber2 = testNumber2; // произвести int в long
//        System.out.println(testLongNumber);
//        System.out.println(testLongNumber2);
//
//        System.out.println("2. int -> byte----------------");
//        byte testByteNumber = (byte) testNumber; // Произвести int -> byte путем “сужения”
//        byte testByteNumber2 = (byte) testNumber2;
//        System.out.println(testByteNumber); //-12
//        System.out.println(testByteNumber2); //-60
//
//        System.out.println("4. int -> double----------------");
//        double testDoubleNumber = testNumber; //  Произвести int -> double
//        double testDoubleNumber2 = testNumber2;
//        System.out.println(testDoubleNumber);
//        System.out.println(testDoubleNumber2);
//
//        System.out.println("3. double -> int----------------");
//        int testIntNumberFromDouble = (int) testDoubleNumber; // Произвести double -> int
//        int testIntNumberFromDouble2 = (int) testDoubleNumber2;
//        System.out.println(testIntNumberFromDouble);
//        System.out.println(testIntNumberFromDouble2);

//        Создать новую строку: “I study Java”
        String str = "I study Java";
        System.out.println(str); // I study Java

//        Вывести в консоль длину строки
        System.out.println(str.length()); // 12

//        Вывести в консоль часть строки “Java” используя substring
        System.out.println(str.charAt(4)); // u
        System.out.println(str.substring(4, str.length())); // udy Java
    }
}
