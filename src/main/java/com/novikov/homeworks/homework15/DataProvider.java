package com.novikov.homeworks.homework15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private final DataMapper mapper = new DataMapper();

    List<Person> provide(String fileName) {
        ArrayList<Person> result = new ArrayList<>();
        List<String> personsData = readFromFile(fileName);
        for (String s : personsData) {
            result.add(mapper.map(s));
        }
        return result;
    }

    private List<String> readFromFile(String fileName) {
        try {
            return Files.readAllLines(Path.of(fileName));
        } catch (IOException e) {
            return new ArrayList<>();
      }
  }
}
