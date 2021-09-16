package objectAndClassExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class opinionPoll {
    static class Person {
        private String name;
        private int age;


        public Person(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }



        @Override
        public String toString() {
            return String.format("%s - %d", this.getName(),this.getAge());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();


        for (int i = 0; i < number ; i++) {
            String[] token = reader.readLine().split(" ");
            String name = token[0];
            int age = Integer.parseInt(token[1]);

            Person newPerson = new Person(name,age);
            people.add(newPerson);
        }
        people = people.stream().filter(person -> person.getAge() > 30 ).collect(Collectors.toCollection(ArrayList::new));
        people.stream().sorted((e1,e2)-> e1.getName().compareTo(e2.getName()))
                .forEach(person -> System.out.println(person.toString()));
    }
}
