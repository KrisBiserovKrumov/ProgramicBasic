package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class containProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Double, List<String>> priceByProduct = new TreeMap<>();

        String line = reader.readLine();

        while (!line.equals("End")){

            String[] productAndPrice = line.split(" ");
            String product = productAndPrice[0];
            Double price = Double.parseDouble(productAndPrice[1]);

            if (!priceByProduct.containsKey(price)){
                priceByProduct.put(price,new ArrayList<>());
            }
            priceByProduct.get(price).add(product);


            line = reader.readLine();
        }

        for (Map.Entry<Double,List<String>> priceOfproduct : priceByProduct.entrySet()){
            System.out.print(priceOfproduct.getKey() + " : ");
            for (String productPair : priceOfproduct.getValue()){
                System.out.print(productPair + ", ");


            }
            System.out.println();
        }
    }
}
