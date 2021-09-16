package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;


public class CountRealNumbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double,Integer> count = new TreeMap<>();

        for (double number : numbers) {
            if (!count.containsKey(number)){
                count.put(number,0);
            }
                count.put(number,count.get(number) + 1);


        }
        for (Map.Entry < Double,Integer > entry : count.entrySet()){
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n",df.format(entry.getKey()),entry.getValue());
        }



    }
}
