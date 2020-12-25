package com.novikov.homeworks.homework15;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DataProviderTest extends TestCase {
    @Test
    void provideWithExistingFile() {
        List<Person> personList = new DataProvider().provide("Not_Existing_File");
        assertNotNull(personList);
        assertTrue(personList.isEmpty());
    }
    public void testProvide() {
        List<Person> personList = new DataProvider().provide("data.csv");
        assertNotNull(personList);
        assertFalse(personList.isEmpty());
    }
}