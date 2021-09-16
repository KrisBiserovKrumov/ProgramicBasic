package demoExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;



public class Dictionary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Map<String, List<String>> text = new TreeMap<>();

        String[] commands = line.split(" \\| ");

        for (String command : commands) {
            String[] token = command.split(": ");
            String word = token[0];
            String explanation = token[1];

            if (!text.containsKey(word)){
                text.put(word,new ArrayList<>());
            }
            text.get(word).add(" -" + explanation);

        }
        String[] examples = reader.readLine().split(" \\| ");
        String end = reader.readLine();

        if (end.equals("List")){
            for (String s : text.keySet()) {
                System.out.print(s + " ");

            }
        }
        for (String example : examples) {
            if (!text.containsKey(example)){
                continue;
            }
            System.out.println(example);
            System.out.println(String.join(System.lineSeparator(),text.get(example).stream().sorted((a,b)->
                    Integer.compare(b.length(),a.length())).collect(Collectors.toList())));
        }


    }
}
