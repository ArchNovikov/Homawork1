package com.novikov.homeworks.homework12;

import java.util.*;

public class Cat {
    Queue<Mouse> stomach = new LinkedList<>();
    ArrayList<Mouse> substance = new ArrayList<>();

    public void eat(Mouse mouse){
        if(stomach.size() < 5) {
            stomach.add(mouse);
            System.out.println("Cat is eating one more mouse...");
        }
        else{
            System.out.println("No more capacity in stomach");
        }
    }

   // public void checkStomach(){
      //  System.out.println("Mice in stomach: ");
       // for (int i = 0; i < stomach.size(); i++) {
         //   System.out.println(stomach.);
       // }
    //}


    public void mouseOut(){
        stomach.poll();
        System.out.println("First mouse is out...");
    }

    public void allMiceOut(){
        substance.addAll(stomach);
        stomach.clear();
        System.out.println("Cat's stomach is empty");
        System.out.println("The substance is: ");
        System.out.println(substance);
        for (Mouse mouse : substance) {
            if (mouse.getName() == "Jerry" && mouse.getCalories() == 460) {
                System.out.println("Jerry is dead");
            }
        }
    }
}
