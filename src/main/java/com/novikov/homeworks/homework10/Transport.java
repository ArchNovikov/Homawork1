package com.novikov.homeworks.homework10;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public abstract class Transport {
    private int issueYear;
    private String country;

    public Transport(int issueYear, String country) {
        this.issueYear = issueYear;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "issueYear=" + issueYear +
                ", country='" + country + '\'' +
                '}';
    }
}
