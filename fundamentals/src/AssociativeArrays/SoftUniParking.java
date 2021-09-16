package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SoftUniParking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<String, List<String>> peopleInParking = new HashMap<>();

        while (n-- > 0){
            String line = reader.readLine();
            String[] token = line.split(" ");
            String command = token[0];
            String name = token[1];
            String plateNumber = token[3];

            if (command.equals("register")){
               if (!peopleInParking.containsKey(name)){
                   peopleInParking.put(name,new ArrayList<>());
               }

            }


        }
    }
}
