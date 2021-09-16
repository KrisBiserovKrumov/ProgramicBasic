package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class StudentAcademy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        LinkedHashMap<String, ArrayList<Double> > studentsGrrate = new LinkedHashMap<>();

        while ( a-- > 0){
            String name = reader.readLine();
            double grade = Double.parseDouble(reader.readLine());

            if (!studentsGrrate.containsKey(name)){
                studentsGrrate.put(name, new ArrayList<>());
                studentsGrrate.get(name).add(grade);
            }else {
                studentsGrrate.get(name).add(grade);
            }
        }
        LinkedHashMap<String,Double> averigeStudents = new LinkedHashMap<>();
        for (String name : studentsGrrate.keySet()){
            double sum = 0;
            for (int i = 0; i <studentsGrrate.get(name).size() ; i++) {
                sum += studentsGrrate.get(name).get(i);
            }
            double avarige = sum / studentsGrrate.get(name).size();
            if (avarige >= 4.50){
                averigeStudents.put(name,avarige);
            }
        }
        averigeStudents.entrySet().stream().sorted(Map.Entry.<String,Double>comparingByValue().reversed())
                .forEach(entry ->{
                    System.out.println(String.format("%s -> %.2f",entry.getKey(),entry.getValue()));
                });
    }
}
