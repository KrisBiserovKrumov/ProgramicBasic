package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;


public class CountRealNumbers3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Double,Integer> numbers = new TreeMap<>();
        String[] numb = reader.readLine().split(" ");

        for (int i = 0; i < numb.length; i++) {
            Double num = Double.parseDouble(numb[i]);
            if (!numbers.containsKey(num)){
                numbers.put(num,0);
            }
            numbers.put(num,numbers.get(num)+1);


        }
        numbers.entrySet().stream().forEach(e->{
            System.out.printf("%.2f -> %d%n",e.getKey(),e.getValue());
        });


    }
}
