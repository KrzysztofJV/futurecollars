package com.futurecollars.taskFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSorter {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", "Smith", 1966, 185, 99));
        personList.add(new Person("Emily", "Cupper", 1959, 165, 61));
        personList.add(new Person("Jack", "Mile", 1941, 187, 79));
        personList.add(new Person("Emma", "Whatson", 1938, 176, 58));
        personList.add(new Person("Chris", "Brown", 1972, 159, 60));
        personList.add(new Person("Michael", "Jones", 1985, 201, 122));

        Collections.sort(personList);
        PersonPrinter.printPerson(personList);

        System.out.println();

        personList.sort(Person.heightComparator);
        PersonPrinter.printPerson(personList);

        System.out.println();

        personList.sort(Person.weightComparator);
        PersonPrinter.printPerson(personList);
    }
}
