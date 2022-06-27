package fc.introduction.person;

import java.util.Objects;

public class Person {

    String name;
    String surName;
    int yearOfBirth;
    int phoneNumber;

    public Person(String name, String surName, int yearOfBirth, int phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth && phoneNumber == person.phoneNumber && Objects.equals(name, person.name) && Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, yearOfBirth, phoneNumber);
    }
}
