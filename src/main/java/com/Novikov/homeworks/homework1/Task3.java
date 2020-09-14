package com.Novikov.homeworks.homework1;

import java.util.Scanner;

public class Task3 {
    public static void square() {
        Scanner scanner = new Scanner(System.in);
        double s, p;
        double a, b, c;

        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();

        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.print("Result: ");
        System.out.println(s);
    }
}
