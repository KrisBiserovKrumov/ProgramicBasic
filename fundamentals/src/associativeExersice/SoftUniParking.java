package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class SoftUniParking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberComand = Integer.parseInt(reader.readLine());

        Map<String,String> registerofPeople = new LinkedHashMap<>();

        while (numberComand-- > 0){
            String line = reader.readLine();
            String[] token = line.split(" ");
            String comand = token[0];
            String name = token[1];


            if (comand.equals("register")){
                String table = token[2];
                if (!registerofPeople.containsKey(name)){
                    registerofPeople.put(name,table);
                    System.out.printf("%s registered %s successfully%n",name,table);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n",table);
                }
            }else {
                if (registerofPeople.containsKey(name)){
                    registerofPeople.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);
                }else {
                    System.out.printf("ERROR: user %s not found%n",name);
                }

            }
        }

        registerofPeople.entrySet().stream().forEach(e->{
            System.out.printf("%s => %s%n",e.getKey(),e.getValue());
        });

    }
}
