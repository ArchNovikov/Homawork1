package com.novikov.homeworks.homework6;

public interface Fraction {
    int getNumerator();
    int getDenominator();


    Fraction plus (Fraction fraction);
    Fraction minus (Fraction fraction);
    Fraction multiply (Fraction fraction);
    Fraction divide (Fraction fraction);


}
