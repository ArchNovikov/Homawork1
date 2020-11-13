package com.novikov.homeworks.homework12;

import lombok.ToString;

import java.util.*;
@ToString
public class Cat {
    PriorityQueue<Mouse> stomach = new PriorityQueue<>(Comparator.comparing(Mouse::getCalories));

    public boolean eat(Mouse mouse) {

        if (stomach.size() > 4) {
            return false;
        }
        return stomach.offer(mouse);
    }

    public Mouse mouseOut() {
        System.out.println("First mouse " + stomach.element() + " is out...");
        return stomach.poll();
    }

    public void allMiceOut() {
        HashSet<Mouse> substance = new HashSet<>(stomach);

        stomach.clear();
        System.out.println("Cat's stomach is empty");
        System.out.println("The substance is: ");
        System.out.println(substance);
        for (Mouse mouse : substance) {
            if (mouse.getName().equals("Jerry") && mouse.getCalories() == 460) {
                System.out.println("Jerry is dead");
            }
        }
    }
}
