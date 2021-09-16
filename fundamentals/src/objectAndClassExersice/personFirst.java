package objectAndClassExersice;

import objects.Person;

public class personFirst {
    static class Person {
        String name;
        String lastName;
        int age;
        String PIN;


    }
    public static void main(String[] args) {
        Person pesho = new Person();
        pesho.age = 1;
        pesho.name = "pesho";
        pesho.lastName= "peshov";
        pesho.PIN = "3477565663";

        Person gosho = new Person();

        gosho.age = 4;
        gosho.name = "gosho";
        gosho.lastName= "goshov";
        gosho.PIN = "098787988";

        System.out.println(pesho.lastName);
        pesho.lastName = "petrov";
        System.out.println(pesho.lastName);
    }
}
