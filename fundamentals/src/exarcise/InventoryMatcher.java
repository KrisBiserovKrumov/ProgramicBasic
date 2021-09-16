package exarcise;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class InventoryMatcher {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] product = reader.readLine().split(" ");
        int[] quantity = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        double[] price = Arrays.stream(reader.readLine().split(" ")).mapToDouble(e -> Double.parseDouble(e)).toArray();
        String line = reader.readLine();
        while (!line.equals("done")) {
            String[] token = line.split(" ");


            for (int i = 0; i < product.length; i++) {


                if (token[0].equals(product[i])) {


                    String price2 = "";
                    price2.valueOf(quantity[i]);
                    String quantity2 = "";
                    quantity2.valueOf(quantity[i]);

                    System.out.printf("%s  costs: " + price2 + "; Available quantity: "+ quantity2, token[0]);

                    break;
                }
            }
            line = reader.readLine();

//
        }
    }
}
