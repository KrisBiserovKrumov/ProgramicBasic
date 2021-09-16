package ListArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Changelist2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String line = reader.readLine();

        while (!line.equals("end")){

            String[] token = line.split(" ");
            String comand = token[0];

            if (comand.equals("Delete")){
                int element = Integer.parseInt(token[1]);
                while (numbers.contains(element)){
                    numbers.remove(Integer.valueOf(element));
                }
            }else {

                int numb = Integer.parseInt(token[1]);
                int index = Integer.parseInt(token[2]);
                if (index < numbers.size()) {

                    numbers.add(index, numb);
                }
            }

            line= reader.readLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
