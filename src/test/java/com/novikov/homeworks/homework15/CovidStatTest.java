package com.novikov.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class CovidStatTest extends TestCase {
    List<Person> people;
    CovidStat stat;

    public void setUp() {
        people = new ArrayList<Person>(List.of(
                new Person.PersonBuilder().name("Ab").surname("Ba").age(10).weight(10).height(170).email("example@ukr.net").build(),
                new Person.PersonBuilder().name("Ab").surname("Bc").age(20).weight(20).height(180).email("example@mail.ru").build(),
                new Person.PersonBuilder().name("Bb").surname("Bc").age(30).weight(30).height(190).email("example@mail.ru").build(),
                new Person.PersonBuilder().name("Bb").surname("Ba").age(40).weight(40).height(160).email("example@gmail.com").build(),
                new Person.PersonBuilder().name("Cb").surname("Bd").age(50).weight(50).height(165).email("example@gmail.com").build()));

        stat = new CovidStatImpl(people);
    }

    public void testGetMostPopularName() {
        assertEquals("Ab", stat.getMostPopularName());
    }

    public void testGetMostPopularSurname() {
        assertEquals("Ba", stat.getMostPopularSurname());
    }

    public void testGetMostPopularEmail() {
        assertEquals("example@gmail.com", stat.getMostPopularEmail());
    }

    public void testGetAverageAge() {
        assertEquals(30.0, stat.getAverageAge());
    }

    public void testGetAverageHeight() {
        assertEquals(173.0, stat.getAverageHeight());
    }

    public void testGetAverageWeight() {
        assertEquals(30.0, stat.getAverageWeight());
    }
}