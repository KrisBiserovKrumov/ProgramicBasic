package associativeExersice;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class coursess {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<String>> programName = new LinkedHashMap<>();
        String line = reader.readLine();

        while (!line.equals("end")){
            String[] token = line.split(" : ");
            String program = token[0];
            String name = token[1];

            if (!programName.containsKey(program)) {
            programName.put(program,new ArrayList<>());
            }
            programName.get(program).add(name);
            line = reader.readLine();
        }
        programName.entrySet().stream().sorted((e1,e2)->Integer.compare(e2.getValue().size(),e1.getValue().size()))
                .forEach(e ->{
                    System.out.printf("%s: %d%n",e.getKey(),e.getValue().size());

                    for (String name : e.getValue()) {
                        System.out.printf("-- %s%n",name);
                    }
                });

    }
}
