package com.novikov.homeworks.homework12;

import lombok.Data;

@Data
public class Mouse implements Comparable<Mouse> {
    private String name;
    private final int calories;

    public Mouse(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public int compareTo(Mouse mouse) {
        return Integer.compare(this.calories, mouse.calories);
    }
}
