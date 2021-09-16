package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AMineral {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> products = new LinkedHashMap<>();
        String line = reader.readLine();

        while (!line.equals("stop")){

            Integer numb = Integer.parseInt(reader.readLine());

            products.putIfAbsent(line,0);
            products.put(line,products.get(line)+numb);
            line = reader.readLine();

        }
       for (Map.Entry<String,Integer> product:products.entrySet()){
           System.out.println(product.getKey() + " -> " + product.getValue());
       }

    }

}
