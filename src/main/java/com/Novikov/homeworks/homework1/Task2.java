package com.Novikov.homeworks.homework1;

import java.util.Scanner;

public class Task2 {
    public static void log() {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Enter a");
        a = scanner.nextDouble();
        System.out.println("Enter b");
        b = scanner.nextDouble();

        double log = Math.log10(b) / Math.log10(a);
        System.out.print("Result: ");
        System.out.println(log);
    }
}
