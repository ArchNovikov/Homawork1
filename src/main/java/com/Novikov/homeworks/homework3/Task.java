package com.Novikov.homeworks.homework3;

public class Task {
    public static void task1() {
        int chinaPopulation = 1360000000;
        int indiaPopulation = 1240000000;
        int total = chinaPopulation + indiaPopulation;
        System.out.println(total); // -1694967296
    }
    public static void task2() {
        int i = 123456789;
        float f = i;
        double d = i;
        short s = (short) i;
        System.out.println("int: " + i); // 123456789
        System.out.println("float: " + f); // 1.23456792E8
        System.out.println("double: " + d); // 1.23456789E8
        System.out.println("short: " + s); // -13035
    }

    public static void task3(){
        int a=1;
        int b=0;
        int c=a/b;
        System.out.println(c); // java.lang.ArithmeticException: / by zero
    }

    public static void task4(){
        double a=1;
        double b=0;
        double c=a/b;
        System.out.println(c); // Infinity
        System.out.println("c+1 = " + (c + 1)); // c+1 = Infinity
        System.out.println("+0.0 == -0.0 : " + (0.0 == -0.0)); // +0.0 == -0.0 : true
        System.out.println("a/(+0.0) = " + (a/(+0.0))); // a/(+0.0) = Infinity
        System.out.println("a/(-0.0) = " + (a/(-0.0))); // a/(-0.0) = -Infinity
    }
    public static void task5(){
        double a=0;
        double b=0;
        double c=a/b;
        System.out.println("c    =" + c); // c    =NaN
        System.out.println("c+0  =" + (c + 0)); // c+0  =NaN
        System.out.println("c<0  =" + (c < 0)); // c<0  =false
        System.out.println("c>0  =" + (c > 0)); // c>0  =false
        System.out.println("c==0 =" + (c == 0)); // c==0 =false
        System.out.println("c!=0 =" + (c != 0)); // c!=0 =true
        System.out.println("c==c =" + (c == c)); // :) // c==c =false
        System.out.println("c!=c =" + (c != c)); // :) // c!=c =true
        System.out.println("c == NaN: " + (c == Double.NaN)); // :))) c == NaN: false
        System.out.println("c is NaN: " + Double.isNaN(c)); // c is NaN: true
    }
}
