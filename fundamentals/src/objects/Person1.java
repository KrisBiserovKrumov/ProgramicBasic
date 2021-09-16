package objects;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Person1 {
    private  String name;
    private  String ID;
    private  int age;

    public Person1(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public String getID(){
        return this.ID;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",this.name,this.ID,this.age);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person1> persons = new ArrayList<>();

        String input = reader.readLine();

        while (!input.equals("End")){

            String[] tokens = input.split(" ");
            String name = tokens[0];
            String ID = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person1 person = new Person1(name,ID,age);
            persons.add(person);


            input = reader.readLine();
        }
        persons.stream().sorted((e1,e2)-> Integer.compare(e1.getAge(),e2.getAge()))
                .forEach(System.out::println);







    }
}
