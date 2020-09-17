package com.novikov.homeworks.homework2;

import java.util.Scanner;

public class Task2 {
    public static void bmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter your height: ");
        int height = scanner.nextInt();

        double bmi = weight / Math.pow(height, 2);

        if (bmi <= 18.5) {
            System.out.println("Your bmi index is " + bmi + " Your're underweight");
        } else if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Your bmi index is " + bmi + " Your're normal");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("Your bmi index is " + bmi + " Your're overweight");
        } else if (bmi > 30) {
            System.out.println("Your bmi index is " + bmi + " Your're obese");
        } else {
            System.out.println("Incorrect values");
        }


    }
}
