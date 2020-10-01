package com.novikov.homeworks.homework5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Hoodie", new Date(), "S", 129.99);
        System.out.println(order1.getItem());
        System.out.println(order1.getDeliveryDate());
        System.out.println(order1.getSize());
        System.out.println(order1.getPrice());
        order1.setItem("Shirt");
        order1.setPrice(290);
        order1.setSize("M");
        System.out.println(order1.getItem());
        System.out.println(order1.getDeliveryDate());
        System.out.println(order1.getSize());
        System.out.println(order1.getPrice());
    }
}
