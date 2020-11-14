package com.novikov.homeworks.homework12;


public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();

        Mouse mouse1 = new Mouse("Mikki", 490);
        Mouse mouse2 = new Mouse("Jerry", 460);
        Mouse mouse3 = new Mouse("Richi", 400);
        Mouse mouse4 = new Mouse("Ratatui", 500);
        Mouse mouse5 = new Mouse("Tachi", 430);
        Mouse mouse6 = new Mouse("Arti", 550);

        cat.eat(mouse1);
        cat.eat(mouse2);
        cat.eat(mouse3);
        cat.eat(mouse4);
        cat.eat(mouse5);
        cat.eat(mouse6);

        System.out.println(cat);
        cat.mouseOut();
        cat.mouseOut();
        System.out.println(cat);
        cat.allMiceOut();

    }
}
