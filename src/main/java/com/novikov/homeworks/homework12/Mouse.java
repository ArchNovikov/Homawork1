package com.novikov.homeworks.homework12;

import lombok.Data;

@Data
public class Mouse {
    private String name;
    private final int calories;

    public Mouse(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }


}
