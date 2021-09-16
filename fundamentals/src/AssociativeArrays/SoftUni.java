package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SoftUni {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        Map<String, String> registration = new LinkedHashMap<>();

        while (number-- > 0){
            String line = reader.readLine();

            String[] commands = line.split(" ");
            String people = commands[1];
            String command = commands[0];


            if (command.equals("register")){
                String table = commands[2];
                if (!registration.containsKey(people)){
                    registration.put(people,table);
                    System.out.printf("%s registered %s successfully%n", people, table);
                }else {
                    System.out.println("ERROR: already registered with plate number " + table);
                }
            }
            else {
                if (registration.containsKey(people)){
                    registration.remove(people);
                    System.out.println(people + " unregistered successfully");

                }else {
                    System.out.printf("ERROR: user %s not found%n",people);
                }
            }

        }
        for (Map.Entry<String,String>entry:registration.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }



    }
}
