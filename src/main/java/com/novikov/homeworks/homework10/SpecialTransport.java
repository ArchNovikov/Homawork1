package com.novikov.homeworks.homework10;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
public class SpecialTransport extends Car {
    private String kind;
    private int weight;

    public SpecialTransport(int issueYear, String country, String model, int price, String equipment, String dateOfSale, String buyersName, String kind, int weight) {
        super(issueYear, country, model, price, equipment, dateOfSale, buyersName);
        this.kind = kind;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() +
                "SpecialTransport{" +
                "kind='" + kind + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecialTransport that = (SpecialTransport) o;
        return weight == that.weight &&
                Objects.equals(kind, that.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kind, weight);
    }
}
