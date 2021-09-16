package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class upgradMachine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] products = reader.readLine().split(" ");
        String[] quantity = reader.readLine().split(" ");
        String[] price = reader.readLine().split(" ");

        Map<String,String> productbyQuantity = new HashMap<>();
        Map<String,String> productbyprice = new HashMap<>();

        for (int i = 0; i < products.length; i++) {
            String product = products[i];
            productbyQuantity.putIfAbsent(product,quantity[i]);
            productbyprice.putIfAbsent(product,price[i]);

        }
        String product = reader.readLine();
        while (!product.equals("done")){
            System.out.printf("%s cost: %s; Available  quantity: %s%n",product,productbyprice.get(product),productbyQuantity.get(product));



            product = reader.readLine();
        }
    }
}
