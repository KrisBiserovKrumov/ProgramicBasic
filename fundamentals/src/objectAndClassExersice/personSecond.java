package objectAndClassExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class personSecond {

    static class Person {
        private String name;
        private String lastName;
        private int age;
        private String PIN;

        public Person(String name, String lastName, int age, String PIN) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.PIN = PIN;
        }

        @Override
        public String toString() {
            return this.PIN + " : " + this.name + " - " + this.lastName + " -> " + this.age;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,List<Person>> personByCountry = new HashMap<>();

        String line = reader.readLine();

        while (!line.equals("End")){
            String[] token =line.split( " ");
            if (token.length == 5){
                String countri = token[0];

                String name = token[1];
                String lastName = token[2];
                int age = Integer.parseInt(token[4]);
                String PIN = token[3];

                personByCountry.putIfAbsent(countri,new ArrayList<>());
                Person person = new Person(name,lastName,age,PIN);
                personByCountry.get(countri).add(person);
                System.out.println("We have added" + person + "int" + countri);



            }else {
                token = line.split("-");

                String countri = token[0];
                String PIN = token[1];
                String command = token[2];
                String commandToChange = token[3];
                String value = token[4];

               // List<Person> peopleInThatCountry = personByCountry.get(countri);
               // Person locatePerson = null;
               // for (Person person : peopleInThatCountry) {
               //     if (person.PIN.equals(PIN)){
               //         locatePerson = person;
               //         break;
               //     }
               // }
                Person locatePerson = personByCountry.get(countri).stream().filter(p->p.PIN.equals(PIN)).findFirst().get();
//
                if (command.equals("add")){
                    switch (commandToChange){
                        case "name":
                            locatePerson.name += value;
                            break;
                        case "lastname":
                            locatePerson.lastName += value;
                            break;
                        case "age":
                            locatePerson.age += Integer.parseInt(value);
                            break;

                    }

                }else if (command.equals("change")){
                    switch (commandToChange){
                        case "name":
                            locatePerson.name = value;
                            break;
                        case "lastname":
                            locatePerson.lastName = value;
                            break;
                        case "age":
                            locatePerson.age = Integer.parseInt(value);
                            break;

                    }

                }
            }

            line = reader.readLine();
        }

        personByCountry.forEach((country,people)->{
            System.out.println("Country : " + country);
            people.forEach(person -> System.out.println(person));
        });
    }
}
