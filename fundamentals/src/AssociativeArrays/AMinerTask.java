package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AMinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map< String, Integer> nameQuantity = new LinkedHashMap<>();

        String product = reader.readLine();

        while (!product.equals("stop")){
            int quantity = Integer.parseInt(reader.readLine());

            nameQuantity.putIfAbsent(product,0);
            int lastValue = nameQuantity.get(product);
            nameQuantity.put(product,quantity + lastValue);

            product = reader.readLine();
        }
        for (Map.Entry<String ,Integer > productPair : nameQuantity.entrySet()){
            System.out.print(productPair.getKey() + " -> " + productPair.getValue() );
            System.out.println();

        }

    }
}
