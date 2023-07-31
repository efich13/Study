package condition; // задание 9

public class TrgArea {
    public static double area(double a, double b, double c) {
        return (a + b + c) / 2;  //p=(a+b+c)/2 полупериметр
    }

    public static double area1(double p, double a, double b, double c) {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); //s=V`p(p-a)(p-b)(p-c)` формула герона
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        double result1 = TrgArea.area1(result, 2, 2, 2); //последние 2 строчки хочу прояснить,не совсем понятна логическое построение
        System.out.println("area (2 , 2, 2) =" + result1);
    }
}
