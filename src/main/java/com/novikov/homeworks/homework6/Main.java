package com.novikov.homeworks.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FractionNumber fractionNumber1 = new FractionNumber(scanner.nextInt(), scanner.nextInt());
        FractionNumber fractionNumber2 = new FractionNumber(scanner.nextInt(), scanner.nextInt());
        fractionNumber1.stringFraction();
        fractionNumber2.stringFraction();
        fractionNumber1.plus(fractionNumber2);
        fractionNumber1.minus(fractionNumber2);







    }
}
