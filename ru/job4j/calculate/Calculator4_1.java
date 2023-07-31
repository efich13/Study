package ru.job4j.calculate; // задание 4_1

public class Calculator4_1 {

    public static void hello(String name, int age) {
            System.out.println("Hello, " + name + " , age = " + age);
        }

        public static void main(String[] args) {
            String name = "Job4j";
            int age = 6;
            Calculator4_1.hello("Job4j", age);
            Calculator4_1.hello(name, 6);
            Calculator4_1.hello(name, age);
            Calculator4_1.hello(name, age);
        }
    }