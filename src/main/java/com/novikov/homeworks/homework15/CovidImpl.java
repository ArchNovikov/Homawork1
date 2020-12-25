package com.novikov.homeworks.homework15;


import lombok.RequiredArgsConstructor;

import java.util.*;

@RequiredArgsConstructor
class CovidStatImpl implements CovidStat {

    private final List<Person> persons;

    @Override
    public String getMostPopularName() {

        persons.sort(Comparator.comparing(Person::getName));
        int index = 0;
        int maxCounter = 1;
        int counter = 1;
        for (int i = 1; i < persons.size(); i++) {

            if (persons.get(i).getName().equals(persons.get(i - 1).getName())) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                    index = i;
                }
            } else {
                counter = 1;
            }
        }
        return persons.get(index).getName();
    }

    @Override
    public String getMostPopularSurname() {
        persons.sort(Comparator.comparing(Person::getSurname));
        int index = 0;
        int maxCounter = 1;
        int counter = 1;
        for (int i = 1; i < persons.size(); i++) {

            if (persons.get(i).getSurname().equals(persons.get(i - 1).getSurname())) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                    index = i;
                }
            } else {
                counter = 1;
            }
        }
        return persons.get(index).getSurname();
    }

    @Override
    public String getMostPopularEmail() {
        persons.sort(Comparator.comparing(Person::getEmail));
        int index = 0;
        int maxCounter = 1;
        int counter = 1;
        for (int i = 1; i < persons.size(); i++) {

            if (persons.get(i).getEmail().equals(persons.get(i - 1).getEmail())) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                    index = i;
                }
            } else {
                counter = 1;
            }
        }
        return persons.get(index).getEmail();
    }

    @Override
    public double getAverageAge() {
        return persons.stream().mapToDouble(Person::getAge).sum() / persons.size();
          }

        @Override
        public double getAverageHeight () {
            return persons.stream().mapToDouble(Person::getHeight).sum() / persons.size();
        }

        @Override
        public double getAverageWeight () {
            return persons.stream().mapToDouble(Person::getWeight).sum() / persons.size();

        }
    }
