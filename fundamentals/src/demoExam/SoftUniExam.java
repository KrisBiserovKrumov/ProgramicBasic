package demoExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SoftUniExam {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imput = reader.readLine();
        HashMap<String,Integer> users = new HashMap<>();
        HashMap<String,Integer> submissions = new HashMap<>();


        while (!imput.equals("exam finished")){

            String[] tonken = imput.split("-");
            if (tonken.length == 3){
                String nema = tonken[0];
                String lenguage = tonken[1];
                int points = Integer.parseInt(tonken[2]);
                if (!users.containsKey(nema)){
                    users.put(nema,points);
                }else if (users.get(nema) < points){
                    users.put(nema,points);
                }
                if (!submissions.containsKey(lenguage)){
                    submissions.put(lenguage,1);
                }else {
                    submissions.put(lenguage,submissions.get(lenguage) + 1);
                }
            }else {
                users.remove(tonken[0]);
            }

            imput = reader.readLine();
        }
        System.out.println("Results:");

        users.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry ->{
                    System.out.println(String.format("%s | %d",entry.getKey(),entry.getValue()));
                });

        System.out.println("Submissions:");

        submissions.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()
                .reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry ->{
                    System.out.println(String.format("%s - %d",entry.getKey(),entry.getValue()));
                });
    }
}
