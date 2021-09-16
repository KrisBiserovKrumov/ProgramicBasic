package ObjectsАndClasses;

import java.util.ArrayList;

public class Persons {
    static  class Person {
        String name;
        String lastName;
        int age;
        String PIN;

        public Person(String name, String lastName, int age, String PIN) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.PIN = PIN;
        }
    }

    public static void main(String[] args) {

        Person pesho = new Person("pesho", "peshov",22,"23232323232");

        Person gosho = new Person("gosho", "goshov",57,"65656543");
       gosho.age = 4;
       gosho.name = "gosho";
       gosho.lastName = "goshov";
       gosho.PIN = "46565656565";
        System.out.println(pesho.lastName);
        pesho.lastName = "petrov";
        System.out.println(pesho.lastName);
        System.out.println(gosho.lastName);

    }
}

