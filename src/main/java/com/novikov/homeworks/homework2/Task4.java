package com.novikov.homeworks.homework2;

import java.util.Scanner;

public class Task4 {
    public static void describeAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(age <= 12){
            System.out.println("You're a kid");
        }
        else if(age >= 13 && age <= 17){
            System.out.println("You're a teenager");
        }
        else if(age >= 18 && age <= 64){
            System.out.println("You're an adult");
        }
        else if(age >= 65){
            System.out.println("You're an eldery");
        }


    }
}
