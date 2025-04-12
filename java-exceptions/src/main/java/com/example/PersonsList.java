package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonsList {
    private final List<Person> people = new ArrayList<>();

    public void add(Person person) {
        people.add(person);
    }

    public Person findByName(String name) {
        if (!name.matches("^[A-Z][a-zA-Z]*\\s[A-Z][a-zA-Z]*$")) {
            throw new IllegalArgumentException("Name format must be 'FirstName LastName'");
        }
        return people.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Person clone(Person original, int newId) {
        return new Person(newId, original.getName(), original.getAge(), original.getOccupation());
    }

    public void writeToFile(Person person, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(person.toString());
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
