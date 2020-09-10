package com.Novikov.homeworks.Homework1;

import java.util.Scanner;

public class Task4 {
    public static void sqrtEqual() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        double d, x1, x2;

        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();
        System.out.println("Enter c: ");
        c = scanner.nextInt();

        d = Math.pow(b, 2) - (4 * a * c);
        x1 = (-b + Math.sqrt(d)) / 2 * a;
        x2 = (-b - Math.sqrt(d)) / 2 * a;

        System.out.println(x1);
        System.out.println(x2);
    }
}
