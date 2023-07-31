package condition; // задание 8

public class SqArea {
    public static double square(double p, double k) {
        return p / (2 * (k + 1)); // =h
    }

    public static double square1(double p, double k) {
        return square(p, k) * k; // = l
    }

    public static double square2(double p, double k) {
        return square1(p, k) * square(p, k); //= s
    }

    public static void main(String[] args) {
        double result1 = SqArea.square2(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}