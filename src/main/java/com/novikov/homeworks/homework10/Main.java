package com.novikov.homeworks.homework10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar1 = new SportCar(2009, "Japan", "Lexus", 20000, "Premium", "28.05.2020", "Alex Marlow", 270, 5.0, 380);
        Car car1 = new Car(2018, "Germany", "BMW", 30000, "Comfort", "30.09.2020", "Tom Marvolo");
        System.out.println(sportCar1);
        System.out.println(car1);
        Sale sale = new Sale();
        sale.saleCars.add(car1);
        sale.saleCars.add(sportCar1);
        System.out.println(sale);
    }
}
