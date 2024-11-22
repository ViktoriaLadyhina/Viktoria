package Summary1;

public class Calculator {
    int a;
    int b;

    public void printAllCalculate(int a, int b) {
        System.out.println("sum = " + getSum(a, b));
        System.out.println("sub = " + getSub(a, b));
        System.out.println("mul = " + getMul(a, b));
        System.out.println("dev = " +  getDev(a, b));
    }

    public int getDev(int a, int b) {
        return a / b;
    }

    public int getMul(int a, int b) {
        return a * b;
    }

    public int getSub(int a, int b) {
        return a - b;
    }

    public int getSum(int a, int b) {
        return a + b;
    }
}

