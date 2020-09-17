package com.novikov.homeworks.homework2;

import java.util.Scanner;

public class Task1 {

    public static void water() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time");
        double time = scanner.nextDouble();
        double litres = Math.floor(time * 0.5);
        System.out.println("->->->" + litres);
    }

}
