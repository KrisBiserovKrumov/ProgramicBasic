package demoExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class IronGirder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Map<String,Integer> townsWithTimes = new HashMap<>();
        Map<String,Integer> townsWithPassengers = new HashMap<>();


        while (!line.equals("Slide rule")){
            if (line.contains("ambush")){
                String[] data = line.split(":");
                String town = data[0];
                String[] secondPart = data[1].split("->");
                int passengers = Integer.parseInt(secondPart[1]);
                if (townsWithTimes.containsKey(town)){
                    townsWithTimes.put(town,0);
                    townsWithPassengers.put(town,townsWithPassengers.get(town) - passengers);
                }

            }else {
                String[] data = line.split(":");
                String town = data[0];
                String[] secondPart = data[1].split("->");
                int time = Integer.parseInt(secondPart[0]);
                int passengers = Integer.parseInt(secondPart[1]);

                if (!townsWithTimes.containsKey(town)){
                    townsWithTimes.put(town,time);
                    townsWithPassengers.put(town,passengers);
                }else {
                    if (townsWithTimes.get(town)> time || townsWithTimes.get(town) == 0){
                        townsWithTimes.put(town,time);
                    }
                    townsWithPassengers.put(town,townsWithPassengers.get(town)+passengers);
                }
            }
            line = reader.readLine();
        }
        townsWithTimes.entrySet().stream().sorted((a,b)->{
            if (a.getValue().compareTo(b.getValue()) == 0){
                return a.getKey().compareTo(b.getKey());
            }else {
                return a.getValue().compareTo(b.getValue());
            }
        }).forEach(entry->{
            if (entry.getValue() != 0 && townsWithPassengers.get(entry.getKey()) > 0){
                System.out.printf("%s -> Time: %d -> Passengers: %d%n",
                        entry.getKey(),entry.getValue(),townsWithPassengers.get(entry.getKey()));

            }
        });
    }
}
