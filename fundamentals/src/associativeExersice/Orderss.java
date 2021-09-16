package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Orderss {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Map<String,Double> productByPrice = new LinkedHashMap<>();

        while (!line.equals("buy")){
            String[] total = line.split(" ");
            String product = total[0];
            double price = Double.parseDouble(total[1]);
            int quantity = Integer.parseInt(total[2]);
            double totalprice = price*quantity;

            if (!productByPrice.containsKey(product)) {
    productByPrice.putIfAbsent(product, totalprice);

            }else {
    productByPrice.put(product, productByPrice.get(product) + totalprice);
}

           line= reader.readLine();
        }
        productByPrice.entrySet().stream().forEach(product -> {
            System.out.printf("%s -> %.2f%n",product.getKey(),product.getValue());
        });

    }
}
