package de.brightslearning.collections.set;

import java.util.Objects;

public class Person {
    private String firstName;
    private String firstLastName;
    private Integer age;

    public Person(String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.firstLastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(firstLastName, person.firstLastName) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, firstLastName, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public Integer getAge() {
        return age;
    }
}
