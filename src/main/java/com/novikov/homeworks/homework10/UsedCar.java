package com.novikov.homeworks.homework10;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
public class UsedCar extends Car {
    private int mileage;
    private String ownerFullName;

    public UsedCar(int issueYear, String country, String model, int price, String equipment, String dateOfSale, String buyersName, int mileage, String ownerFullName) {
        super(issueYear, country, model, price, equipment, dateOfSale, buyersName);
        this.mileage = mileage;
        this.ownerFullName = ownerFullName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "UsedCar{" +
                "mileage=" + mileage +
                ", ownerFullName='" + ownerFullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UsedCar usedCar = (UsedCar) o;
        return mileage == usedCar.mileage &&
                Objects.equals(ownerFullName, usedCar.ownerFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mileage, ownerFullName);
    }
}
