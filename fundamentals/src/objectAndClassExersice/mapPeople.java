package objectAndClassExersice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapPeople {
    static class Person {
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
        Map<String, List<Person>> peopleByCountry = new HashMap<>();
        peopleByCountry.put("Bulgaria", new ArrayList<>());
        peopleByCountry.get("Bulgaria").add(new Person("pesho", "peshov", 22, "43645754634"));
        peopleByCountry.get("Bulgaria").add(new Person("gosho", "goshov", 44, "489987978794"));

        peopleByCountry.put("Serbia", new ArrayList<>());
        peopleByCountry.get("Serbia").add(new Person("Lepa", "Brena", 53, "0874554"));
        peopleByCountry.get("Serbia").add(new Person("Mile", "Kitic", 67, "094856748"));
    }
}
