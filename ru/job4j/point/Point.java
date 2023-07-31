package ru.job4j.point;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); // d=V`(x2-x1)^2+(y2-y1)^2`
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 4, 2, 5);
        System.out.println("result (1, 4) to (2, 5) " + result);
    }
}
