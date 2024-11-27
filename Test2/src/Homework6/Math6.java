package Homework6;

public class Math6 {

// Задача 1
    public boolean isEvenLength(String word) {
        return word.length() % 2 == 0;
    }

    public String combineWords(String word1, String word2) {
        int halfLengthWord1 = word1.length() / 2;
        int halfLengthWord2 = word2.length() / 2;

        String firstHalfWord1 = word1.substring(0, halfLengthWord1);
        String secondHalfWord2 = word2.substring(halfLengthWord2);

        return firstHalfWord1 + secondHalfWord2;
    }
    // Задача 2
    int a;
    int b;

    public void getSum(int a, int b) {
        System.out.println(a + b);
    }

    public void getSub(int a, int b) {
        System.out.println(a - b);
    }

    public void getMul(int a, int b) {
        System.out.println(a * b);
    }

    public void getDiv(int a, int b) {
        System.out.println(a / b);
    }

}
