package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class AMineralTast {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String product = reader.readLine();

        Map<String,Integer> productByQuantity = new LinkedHashMap<>();

        while (!product.equals("stop")){
            int quantity = Integer.parseInt(reader.readLine());
            if (!productByQuantity.containsKey(product)) {
                productByQuantity.putIfAbsent(product, quantity);
            }else {

                productByQuantity.put(product, productByQuantity.get(product) + quantity);
            }

            product = reader.readLine();

        }
        for (String products : productByQuantity.keySet()) {
            System.out.printf("%s -> %d%n",products,productByQuantity.get(products) );

        }

    }
}
