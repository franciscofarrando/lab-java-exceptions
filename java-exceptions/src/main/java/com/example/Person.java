package com.example;

public class Person {
    private int id;
    private String name;
    private int age;
    private String occupation;

    public Person(int id, String name, int age, String occupation) {
        this.id = id;
        this.name = name;
        setAge(age);
        this.occupation = occupation;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age no puede ser menor de 0");
        }
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public boolean equals(Person other) {
        return this.name.equals(other.name)
                && this.age == other.age
                && this.occupation.equals(other.occupation);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Age: %d, Occupation: %s",
                id, name, age, occupation);
    }
}

