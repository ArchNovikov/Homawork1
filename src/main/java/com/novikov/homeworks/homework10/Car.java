package com.novikov.homeworks.homework10;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
public class Car extends Transport{
    private String model;
    private int price;
    private String equipment;
    private String dateOfSale;
    private String buyersName;


    public Car(int issueYear, String country, String model, int price, String equipment, String dateOfSale, String buyersName) {
        super(issueYear, country);
        this.model = model;
        this.price = price;
        this.equipment = equipment;
        this.dateOfSale = dateOfSale;
        this.buyersName = buyersName;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", equipment='" + equipment + '\'' +
                ", dateOfSale='" + dateOfSale + '\'' +
                ", buyersName='" + buyersName + '\'' +
                ", issueYear=" + getIssueYear() +
                ", country='" + getCountry() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return price == car.price &&
                Objects.equals(model, car.model) &&
                Objects.equals(equipment, car.equipment) &&
                Objects.equals(dateOfSale, car.dateOfSale) &&
                Objects.equals(buyersName, car.buyersName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, price, equipment, dateOfSale, buyersName);
    }
}
