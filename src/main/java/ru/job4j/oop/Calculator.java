package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public  int divide(int y) {
        return y / x;
    }

    public  int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result1 = calc.sum(10);
        int result2 = calc.multiply(10);
        int result3 = minus(10);
        int result4 = calc.divide(10);
        int result = calc.sumAllOperation(10);
    }
}
