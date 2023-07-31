package ru.job4j.calculate; //задание 4

public class Calculator4 {
    public static void plus(int first, int second) {

        int result = first + second;

        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator4.plus(100, 500);
        Calculator4.plus(4, 2);
        Calculator4.plus(3, 5);

    }

}
