package ru.job4j.calculate; // задание 4.2

public class MathFunc { //почему имя файла так помешало созданию консоли??
    public static int func1(int x) {

       return x * x + 1;
    }

    public static int func2(int x) {

      return  10 * x;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(100);
        int result2 = MathFunc.func2(3);
        int total = result1 + result2;
        System.out.println(total);

    }
}
