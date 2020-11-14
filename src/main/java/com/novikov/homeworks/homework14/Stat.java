package com.novikov.homeworks.homework14;

import java.util.Arrays;

public class Stat<T extends Number> {
    private final T[] data;



    public Stat(T[] data) {
        this.data = data;
    }

    public void printData(){
        System.out.println(Arrays.toString(data));
    }

    public double average(){
        double average = 0;
        for (T dataItem: data
             ) {
            average += dataItem.doubleValue();
        }
        return average/data.length;
    }

    public boolean isSameAverage(Stat<?> stat){
        return average() == stat.average();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stat<?> stat = (Stat<?>) o;
        return Arrays.equals(data, stat.data);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }
}
