package ObjectsАndClasses;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 public class personCountry {
    static  class Person {
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
            return this.PIN + ": " +  this.name + " " + this.lastName + " {" + this.age + "} ";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        Person pesho = new Person("pesho", "peshov", 22, "23232323232");
//        Person gosho = new Person("gosho", "goshov", 57, "65656543");
//        List<Person> people = new ArrayList<>();
        Map<String, List<Person>> peopleByCountry = new HashMap<>();

//        peopleByCountry.put("Bulgaria",new ArrayList<>());
//        List<Person> peopleInBulgaria = peopleByCountry.get("Bulgaria");
//        peopleInBulgaria.add(new Person("pesho", "goshov", 18 , "54353543" ));
//        peopleInBulgaria.add(new Person("gosho", "gpeshov", 55 , "586754534" ));
//
//        peopleByCountry.put("Serbia",new ArrayList<>());
//        List<Person> peopleInSerbia = peopleByCountry.get("Serbia");
//        peopleInBulgaria.add(new Person("Lepa", "Brena", 64 , "65433456" ));
//        peopleInBulgaria.add(new Person("Mile", "Kitic", 55 , "732754534" ));

        String line = reader.readLine();
        while (!line.equals("end")){
            String[]tokens = line.split(" ");
            if (tokens.length == 5){
                String country = tokens[0];
                String name = tokens[1];
                String LastName = tokens[2];
                int age = Integer.parseInt(tokens[4]);
                String PIN = tokens[3];

                peopleByCountry.put(country,new ArrayList<>());
                Person person = new Person(name, LastName, age , PIN);
                peopleByCountry.get(country).add(person);
                System.out.println("We have added " + person + " into " + country);

            }else {
                tokens = line.split("-");
                String country = tokens[0];
                String PIN = tokens[1];
                String cmd = tokens[2];
                String fieldToChange = tokens[3];
                String value = tokens[4];


//           List<Person> peopleInThatCountry = peopleByCountry.get(country);
//           Person localedPerson = null;
//                for (Person person : peopleInThatCountry) {
//                    if (person.PIN.equals(PIN)){
//                        localedPerson = person;
//                        break;
//                    }
//
//                }
               Person localedPerson =  peopleByCountry.get(country).stream().filter(p -> p.PIN.equals(PIN)).findFirst().get();

                switch (cmd) {
                    case "add":
                        switch (fieldToChange){
                            case "name":
                                localedPerson.name += value;
                                break;
                            case "LastName":
                                localedPerson.lastName += value;
                                break;
                            case "age":
                                localedPerson.age += Integer.parseInt(value);
                                break;
                        }

                        break;
                    case "change":
                        switch (fieldToChange){
                            case "name":
                                localedPerson.name = value;
                                break;
                            case "LastName":
                                localedPerson.lastName = value;
                                break;
                            case "age":
                                localedPerson.age = Integer.parseInt(value);
                                break;
                        }
                        break;
                        default:
                            break;
                }
            }

            line = reader.readLine();
        }
        peopleByCountry.forEach((country, people) -> {
            System.out.println("Country: " + country);
            people.forEach(System.out :: println );
        });
    }

}


