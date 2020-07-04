package ru.timokhina.lesson8;

public class Task01Calculator {
    public static void main(String[] args) {

        double a = 5;
        double b = 10;

        System.out.println(sum(a,b));
        System.out.println(sub(a,b));
        System.out.println(mult(a,b));
        System.out.println(dev(a,b));
        System.out.println(percent(a,b));
    }

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;

    }

    public static double sub(double a, double b) {
        double sub = a - b;
        return sub;
    }

    public static double mult(double a, double b) {
        double mult = a * b;
        return mult;
    }

    public static double dev(double a, double b) {
        double dev = a / b;
        return dev;
    }

    public static double percent(double a, double b) {
        double percent = a * b / 100;
        return percent;
    }
}

