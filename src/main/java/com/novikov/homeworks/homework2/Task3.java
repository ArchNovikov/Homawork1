package com.novikov.homeworks.homework2;

import java.util.Scanner;

public class Task3 {
    public static void century() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        double year = scanner.nextInt();
        int century = (int) Math.ceil(year / 100);

        System.out.println("Century is: " + century);

    }
}
