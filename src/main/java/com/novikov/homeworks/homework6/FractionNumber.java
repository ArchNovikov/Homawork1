package com.novikov.homeworks.homework6;

import java.util.Scanner;

public class FractionNumber implements Fraction {
    private final int numerator;
    private final int denominator;

    public FractionNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public int getNumerator() {
        return numerator;
    }


    public int getDenominator() {
        return denominator;
    }

    public String stringFraction2(){
        return getNumerator() + "/" + getDenominator();
    }
    public void stringFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction plus(Fraction fraction) {
        if(getNumerator() == fraction.getNumerator()){
            FractionNumber fractionNumber3 = new FractionNumber(getNumerator() + fraction.getNumerator(), getDenominator());
            System.out.println(fractionNumber3.numerator + "/" + fractionNumber3.denominator);
            return fractionNumber3;
        }
        else {
            FractionNumber fractionNumber3 = new FractionNumber(getNumerator() * fraction.getDenominator() + fraction.getNumerator() * getDenominator(), getDenominator() * fraction.getDenominator());
            System.out.println(fractionNumber3.numerator + "/" + fractionNumber3.denominator);
            return fractionNumber3;
        }
    }


    public Fraction minus(Fraction fraction) {
        if(getNumerator() == fraction.getNumerator()){
            FractionNumber fractionNumber3 = new FractionNumber(getNumerator() - fraction.getNumerator(), getDenominator());
            System.out.println(fractionNumber3.numerator + "/" + fractionNumber3.denominator);
            return fractionNumber3;
        }
        else {
            FractionNumber fractionNumber3 = new FractionNumber(getNumerator() * fraction.getDenominator() - fraction.getNumerator() * getDenominator(), getDenominator() * fraction.getDenominator());
            System.out.println(fractionNumber3.numerator + "/" + fractionNumber3.denominator);
            return fractionNumber3;
        }
    }


    public Fraction multiply(Fraction fraction) {
        FractionNumber fractionNumber3 = new FractionNumber(getNumerator() * fraction.getNumerator(), getDenominator() * fraction.getDenominator());
        System.out.println(fractionNumber3.numerator + "/" + fractionNumber3.denominator);
        return fractionNumber3;
    }


    public Fraction divide(Fraction fraction) {
        FractionNumber fractionNumber3 = new FractionNumber(getNumerator() * fraction.getDenominator(), getDenominator() * fraction.getNumerator());
        System.out.println(fractionNumber3.numerator + "/" + fractionNumber3.denominator);
        return fractionNumber3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FractionNumber that = (FractionNumber) o;
        return numerator/(double)denominator == that.numerator/(double)that.denominator;
    }

    @Override
    public int hashCode() {
        double value = numerator/(double)denominator;
        int result = (int) value;
        result = 31 * result;
        return result;
    }
}
