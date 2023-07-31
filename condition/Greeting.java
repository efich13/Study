package condition; // задание 9_1

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        idea = idea + " But I am a newbie";
        int year = 2023;
        String separate = " ";
        String id = idea + separate + year;
        System.out.println(id);
        // задание 9.2
        //1. с потерей данных так как byte у нас ститает до 127 а нам дано 129
        //2. не совсем понял, ибо запутался в f у float
        //3.без потерь данных во float входит число которое задано в char
        //4. с потерей данных в bite у нас входят только числа до 127, а значение double
        // у нас имеет значение с плавающей точкой, поэтому в 121.19 мы потеряем 19 после точки
        //5.без потерь данных char принимает число которе задано в short

    }
}
