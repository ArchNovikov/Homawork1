package com.novikov.homeworks.homework14;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;


public class StatTest {

    private final Integer[] intData = {1,2,3,6};
    private final Integer[] intData2 = {2,2,3,5};
    private final Double[] doubleData = {1.0, 2.3, 3.5, 5.2};
    private final String[] stringData = {"asd", "asdasd", "odsalkj", "daljskcn"};

    @BeforeEach
    public void setUp(){
        Integer[] intData = {1,2,3,6};
        Double[] doubleData = {1.0, 2.3, 3.5, 5.2};
        String[] stringData = {"asd", "asdasd", "odsalkj", "daljskcn"};
    }

    @Test
    void printData(){
        new Stat<>(intData).printData();
        new Stat<>(doubleData).printData();
    }
    @Test
    void average() {
        assertEquals(3.0, new Stat(intData).average());
        assertEquals(3.0, new Stat(doubleData).average());
    }
    @Test
    void isSameAverage() {
        Stat<Integer> integerStat = new Stat<>(intData2);
        assertTrue(new Stat<>(intData).isSameAverage(new Stat<>(doubleData)));
    }
}