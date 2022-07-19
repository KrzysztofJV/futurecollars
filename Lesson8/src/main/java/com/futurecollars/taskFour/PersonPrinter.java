package com.futurecollars.taskFour;

import java.util.List;

public class PersonPrinter {

    public static void printPerson(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getSurname() + " " + person.getDateOfBirth() + " " +
                    person.getHeight() + " " + person.getWeight());
        }
    }
}
