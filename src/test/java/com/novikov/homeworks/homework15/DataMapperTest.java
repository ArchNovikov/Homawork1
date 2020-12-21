package com.novikov.homeworks.homework15;

import junit.framework.TestCase;

public class DataMapperTest extends TestCase {

    public void testMap() {
        Person expectedPerson = new Person.PersonBuilder().
                name("Eugene").
                surname("Berezhnyi").
                age(32).
                height(170).
                weight(81).
                email("berezhnoy87@gmail.com").
                build();
        Person person = new DataMapper().map("Eugene,Berezhnyi,32,170,81,berezhnoy87@gmail.com");
        assertEquals(expectedPerson, person);
    }
}