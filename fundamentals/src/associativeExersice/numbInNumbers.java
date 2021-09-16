package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class numbInNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        TreeMap<Integer,Integer> numbs = new TreeMap<>();

        for (int number : numbers) {
            if (!numbs.containsKey(number)){
                numbs.put(number,0);
            }
            numbs.put(number,numbs.get(number) + 1);
        }
        DecimalFormat df = new DecimalFormat("#.#######");
       //for (Map.Entry<Integer,Integer> num : numbs.entrySet()){
       //
       //    System.out.printf("%s -> %d%n",df.format(num.getKey()),num.getValue());
       //}
        numbs.entrySet().stream().sorted((num1,num2)->
            Integer.compare(num2.getValue(),num1.getValue()))
                .forEach(num -> {
                    double number = num.getKey();
                    String formater = df.format(number);
                    int count = num.getValue();
                    System.out.printf("%s -> %d%n",formater,count);

                });

    }
}
