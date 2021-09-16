package ListArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TRain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> wagons = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(reader.readLine());

        String line = reader.readLine();

        while (!line.equals("end")){
            String[] token = line.split(" ");
            if (token[0].equals("Add")){
                int newwagon = Integer.parseInt(token[1]);
                wagons.add(newwagon);
            }else{
                 int passangers = Integer.parseInt(token[0]);
                wagons.stream().filter(w ->maxCapacity - w >= passangers)
                         .findFirst()
                         .ifPresent(freewagon -> {
                             int indexofWagon = wagons.indexOf(freewagon);
                             wagons.set(indexofWagon,freewagon + passangers);});

            }



            line =reader.readLine();
        }
        wagons.forEach(w -> System.out.print(w + " "));

    }
}
