package ru.job4j.converter.Converter; //задание 5

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 99.82f;
    }

    public static float euroToRuble(float value) {
        return value * 99.82f;
    }

    public static float rubleToDollar(float value) {
        return value / 35;
    }

    public static float dollarToRuble(float value) {
        return value * 35;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(1000);
        System.out.println("1000 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(1000);
        System.out.println("1000 rubles are " + dollar + " dollar.");
        float rouble = Converter.euroToRuble(1000);
        System.out.println("1000 euro are " + rouble + " rouble.");
        float rouble1 = Converter.dollarToRuble(1000);
        System.out.println("1000 dollar are " + rouble1 + " rouble. ");
    }
}
