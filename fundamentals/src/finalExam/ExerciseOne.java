package finalExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Map<String,Integer> nameTime = new HashMap<>();
        Map<String, List<String>> groupeNames = new LinkedHashMap<>();
        int totaltime = 0;

        while (!line.equals("start of concert")){

            if (line.contains("Play")){
                String[] timeForGroupe = line.split("; ");
                String name = timeForGroupe[1];
                Integer minute = Integer.parseInt(timeForGroupe[2]);

                if (!nameTime.containsKey(name)){
                    nameTime.put(name,minute);
                    totaltime += minute;
                }else {
                    nameTime.put(name,nameTime.get(name) + minute);
                    totaltime += minute;
                }
            }else {
                String[] namesOfGrupe = line.split("; ");
                String nameGrupe = namesOfGrupe[1];
                String[] names = namesOfGrupe[2].split(", ");
                if (!groupeNames.containsKey(nameGrupe)){
                    groupeNames.put(nameGrupe,new ArrayList<>());
                }
                for (int i = 0; i <names.length ; i++) {
                    if (!groupeNames.get(nameGrupe).contains(names[i])){
                        groupeNames.get(nameGrupe).add(names[i]);
                    }

                }
            }
            line = reader.readLine();
        }
        String sortedNames = reader.readLine();
        System.out.println("Total time: " + totaltime);
        nameTime.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()
                .reversed().thenComparing(Map.Entry.comparingByKey())).forEach(entry->{
            System.out.println(String.format("%s -> %d",entry.getKey(),entry.getValue()));
        });
        System.out.println(sortedNames);
        groupeNames.get(sortedNames).stream().forEach(e->{
            System.out.println("=> " + e);
        });
    }
}
