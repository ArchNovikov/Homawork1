package com.novikov.homeworks.homework10;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
public class SportCar extends Car {
    private int maxSpeed;
    private double engineCapacity;
    private int horsePower;

    public SportCar(int issueYear, String country, String model, int price, String equipment, String dateOfSale, String buyersName, int maxSpeed, double engineCapacity, int horsePower) {
        super(issueYear, country, model, price, equipment, dateOfSale, buyersName);
        this.maxSpeed = maxSpeed;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return super.toString() + "SportCar{" +
                "maxSpeed=" + maxSpeed +
                ", engineCapacity=" + engineCapacity +
                ", horsePower=" + horsePower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return maxSpeed == sportCar.maxSpeed &&
                Double.compare(sportCar.engineCapacity, engineCapacity) == 0 &&
                horsePower == sportCar.horsePower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed, engineCapacity, horsePower);
    }
}
