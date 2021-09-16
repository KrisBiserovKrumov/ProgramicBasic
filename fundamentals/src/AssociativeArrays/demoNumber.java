package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class demoNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double , Integer> countByNumber = new TreeMap<>();

        for (Double number : numbers) {

            if (!countByNumber.containsKey(number)){
                countByNumber.put(number, 0);
                //countByNumber.putIfAbsent(number, 0);
            }
            int lastValue = countByNumber.get(number);
            countByNumber.put(number , lastValue + 1);
        }
        DecimalFormat df = new DecimalFormat("#.#######");
        for (Map.Entry<Double , Integer> pair : countByNumber.entrySet()){
            double number = pair.getKey();
            String formatToNumber = df.format(number);
            int count = pair.getValue();
            System.out.printf("%s -> %d%n",formatToNumber,count);
        }



    }
}
