package io.oreon.vilde.sandbox;

import java.time.LocalDateTime;
import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int height;

    public Person(String firstName, String lastName, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public int getBirthYear() {
         int birthYear = LocalDateTime.now().getYear() - this.age;
         return birthYear;
    }

    @Override
    public String toString() {
        return "First name " + this.firstName + " last name " + this.lastName + " age " + this.age + " height " + this.height;
    }
}
