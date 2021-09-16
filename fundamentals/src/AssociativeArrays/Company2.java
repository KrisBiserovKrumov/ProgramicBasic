package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Company2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        Map<String,Integer> peopleGrades = new HashMap<>();
        Map<String,Integer> courseNumber = new HashMap<>();

        while (!line.equals("exam finished")){
            String[] comand = line.split("-");
            String name = comand[0];
            String course = comand[1];
            if (course.equals("banned")){
                peopleGrades.remove(name);

            }else {
                Integer grate = Integer.parseInt(comand[2]);

                if (!peopleGrades.containsKey(name)) {
                    peopleGrades.put(name, 0);
                }
                if (grate > peopleGrades.get(name)) {
                    peopleGrades.put(name, grate);
                }
                if (!courseNumber.containsKey(course)) {
                    courseNumber.put(course, 0);
                }
                courseNumber.put(course, courseNumber.get(course) + 1);

            }
            line = reader.readLine();
        }
        System.out.println("Results:");
        peopleGrades.entrySet().stream().sorted((a,b)->{
            if (a.getValue().equals(b.getValue())){
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue().compareTo(a.getValue());
        }).forEach(e->{
            System.out.println(e.getKey() + " | " + e.getValue());
        });
        
        System.out.println("Submissions:");
        courseNumber.entrySet().stream().sorted((c,d)->{
            if (c.getValue().equals(d.getValue())){
                return c.getKey().compareTo(d.getKey());
            }
            return d.getValue().compareTo(c.getValue());
        }).forEach(e->{
            System.out.println(e.getKey() + " - " + e.getValue());
        });


    }
}
