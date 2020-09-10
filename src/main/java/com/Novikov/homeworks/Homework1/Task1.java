package com.Novikov.homeworks.Homework1;

public class Task1 {


    public static void task19() {
        double x = 0.2;
        double y;
        y = Math.acos(Math.tan(5 * x / Math.PI)) + Math.pow(x, 3.2) / 28;
        System.out.println(y);
    }

    public static void task20() {
        int x = 1;
        double y;
        y = (Math.cbrt(Math.pow(Math.log(x), 2))) + Math.tan(Math.cos(Math.PI * x)) * Math.abs(Math.log(x / 10.5 + 1 / 3));
        System.out.println(y);
    }

    public static void task21() {
        int x = 1;
        double y;
        y = Math.sqrt(Math.sqrt(Math.log10(x))) + Math.acos(x + 3) * (1 / Math.abs(x + 2 * Math.pow(x, 2)));
        System.out.println(y);
    }

    public static void task22() {
        int x = 1;
        double y;
        y = Math.asin(Math.log10(x) / Math.pow(x, 2) + (5 * x) + 1) - (Math.pow(x, 3.2) / 28);
        System.out.println(y);
    }

    public static void task23() {
        int x = 1;
        double y;
        y = Math.acos(Math.tan(5 * x / Math.PI) + Math.pow(x, 5.7) / 23);
        System.out.println(y);
    }

    public static void task24() {
        int x = 1;
        double y;
        y = Math.atan(Math.abs(8.3 - 21 * Math.pow(x, 2) - 0.8 * x) / Math.cbrt(2.5 + 1 / Math.pow(x, 2)));
        System.out.println(y);
    }

    public static void task25() {
        int x = 1;
        double y;
        y = Math.sqrt(Math.sqrt(Math.log10(Math.acos(Math.abs(Math.pow(x, 3.4) + 2.5 * Math.pow(x, 1.2) - 0.7) / Math.cbrt(Math.pow(Math.E, 2.5 * x)))))) + 1;
        System.out.println(y);
    }

    public static void task26() {
        int x = 1;
        double y;
        y = Math.log(Math.sin(x)) + 2 * Math.pow(Math.E, x) + 2 * Math.cos(Math.abs(x)) + 2;
        System.out.println(y);
    }
}