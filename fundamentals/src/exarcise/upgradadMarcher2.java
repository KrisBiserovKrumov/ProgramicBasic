package exarcise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class upgradadMarcher2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> products = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        long[] quantities = Arrays.stream(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        double[] prices = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();



        String productAndPrice = sc.nextLine();
        while (!productAndPrice.equals("done")) {
            String[] productPair = productAndPrice.split(" ");
            String product = productPair[0];
            long quantity = Long.parseLong(productPair[1]);

            int productIndex = products.indexOf(product);
            long oldQuantity = 0;
            if (productIndex < quantities.length) {
                oldQuantity = quantities[productIndex];
            }
            if (oldQuantity < quantity) {
                System.out.printf("We do not have enough %s%n", product);
            } else {
                System.out.printf("%s x %d costs %.2f%n", product, quantity, prices[productIndex] * quantity);
                quantities[productIndex]-=quantity;
            }

            productAndPrice = sc.nextLine();
        }
    }
}
