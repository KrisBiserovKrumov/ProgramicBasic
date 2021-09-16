package ListArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String line = reader.readLine();

        while (!line.equals("end")){
            String[] tokens = line.split(" ");
            String command = tokens[0];
            switch (command){
                case "Contains":
                    int element = Integer.parseInt(tokens[1]);

                    if (numbers.contains(element)){
                        System.out.print("Yes");
                    }else{
                        System.out.print("No such number");
                    }
                    break;

                case "Print":
                    String parity  = tokens[1];
                    if (parity.equals("even")){
                        numbers.stream().filter(n -> n % 2 == 0).
                                forEach(e -> System.out.print(e + " "));
                    }

                    else{
                        numbers.stream().filter(n -> n % 2 == 1).
                                forEach(e -> System.out.print(e + " "));
                    }
                    break;

                case "Get":
                    System.out.print(numbers.stream().reduce((e1,e2) -> e1 + e2).get());
                    break;
                case "Filter":
                    String condition  = tokens[1];
                    int numbs = Integer.parseInt(tokens[2]);

                    if (condition.equals("<")){
                        numbers.stream().filter(e -> e < numbs)
                                .forEach(e -> System.out.print(e + " "));
                    }else if (condition.equals(">")){
                        numbers.stream().filter(e -> e > numbs)
                                .forEach(e -> System.out.print(e + " "));

                    }else if (condition.equals(">=")){
                        numbers.stream().filter(e -> e >= numbs)
                                .forEach(e -> System.out.print(e + " "));

                    }else {
                        numbers.stream().filter(e -> e <= numbs)
                                .forEach(e -> System.out.print(e + " "));
                    }
                    break;
                    default:
                        break;

            }
            System.out.println();
            line = reader.readLine();
        }
    }
}
