package com.novikov.homeworks.homework15;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private final String name;
    private final String surname;
    private final String email;
    private final int age;
    private final int weight;
    private final int height;

    public Person(String name, String surname, String email, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}

