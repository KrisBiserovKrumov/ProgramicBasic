package objects;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        ArrayList<Person> people = new ArrayList<>();

        while (n-- > 0){
            String[] data = scan.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person p = new Person(name,age);
            people.add(p);

        }
       people =  people.stream().filter(p -> p.getAge() > 30)
                .collect(Collectors.toCollection(ArrayList::new));

        people.stream()
                .sorted((f,s) -> f.getName().compareTo(s.getName()))
                .forEach(p-> System.out.println(p.toString()));
    }
}
