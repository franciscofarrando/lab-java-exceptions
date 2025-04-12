package com.example;

    public class Main {
        public static void main(String[] args) {
            // Creo array de personas
            PersonsList list = new PersonsList();

            // Creo personas
            Person person1 = new Person(1, "francisco farrando", 33, "architect");
            Person person2 = new Person(2, "francisco farrando", 33, "architect");
            Person person3 = new Person(3, "alfonso farrando", 41, "architect");
            Person person4 = new Person(4, "victoria grosso", 30, "designer");
            Person person5 = new Person(5, "rebecca hoffman", 26, "physicians");
            Person person6 = new Person(6, "Andrea Franzzoni", 25, "deliveryman");

            // los agrego a la lista (array)
            list.add(person1);
            list.add(person2);
            list.add(person3);
            list.add(person4);
            list.add(person5);
            list.add(person6);


            //comparo dos personas
            boolean areEqual = person2.equals(person1);
            System.out.println("¿Las personas 1 y 2 son iguales? " + areEqual);

            // busco por nombre
            try {
                Person found = list.findByName("Andrea Franzzoni");
                System.out.println("Persona encontrada: " + found);
            } catch (IllegalArgumentException e) {
                System.out.println("Error al buscar persona: " + e.getMessage());
            }

            // clono una persona
            Person clone = list.clone(person1, 3);
            System.out.println("Persona clonada: " + clone);

            // escribo una persona a un archivo
            list.writeToFile(person1, "person1.txt");
            System.out.println("Persona escrita en archivo person1.txt");
        }
    }