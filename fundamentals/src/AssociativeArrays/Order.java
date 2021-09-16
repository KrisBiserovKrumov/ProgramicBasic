package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Order {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Map<String,Double> productCost = new LinkedHashMap<>();

        while (!line.equals("buy")){
            String[] tokens = line.split(" ");
            String product = tokens[0];
           Double price = Double.parseDouble(tokens[1]);
            Double quantity = Double.parseDouble(tokens[2]);
            double totalPrice = price * quantity;

            productCost.putIfAbsent(product,0.0);
            productCost.put(product,productCost.get(product) + totalPrice);

            line = reader.readLine();
        }

    }
}
