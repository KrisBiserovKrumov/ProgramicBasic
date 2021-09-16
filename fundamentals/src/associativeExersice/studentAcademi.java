package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class studentAcademi {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numComand = Integer.parseInt(reader.readLine());
        LinkedHashMap<String, ArrayList<Double>> nameGrade = new LinkedHashMap<>();

        while (numComand-- > 0){
            String name = reader.readLine();
            double grade = Double.parseDouble(reader.readLine());
            if (!nameGrade.containsKey(name)) {
                nameGrade.put(name,new ArrayList<>());
                nameGrade.get(name).add(grade);
            }else {
                nameGrade.get(name).add(grade);
            }
        }
        LinkedHashMap<String,Double> averigeGrade = new LinkedHashMap<>();
        for (String name : nameGrade.keySet()) {
            double sum = 0;
            for (int i = 0; i < nameGrade.get(name).size() ; i++) {
                sum += nameGrade.get(name).get(i);
            }
            double averige = sum / nameGrade.get(name).size();
            if (averige >= 4.50){
                averigeGrade.put(name,averige);
            }
        }
        averigeGrade.entrySet().stream().sorted(Map.Entry.<String,Double>comparingByValue().reversed())
                .forEach(entry ->{
                    System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
                });
    }
}
