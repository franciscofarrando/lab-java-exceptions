package com.example;

public class Main {
    public static void main(String[] args) {
    Person person = new Person(1, "francisco farrando", 33, "architect");
    Person person2 = new Person(2, "francisco farrando", 33, "architect");
    Person person3 = new Person(3, "alfonso farrando", 33, "architect");

        System.out.println(person.equals(person2));

        }
    }
