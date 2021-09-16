package AssociativeArrays;

import java.util.*;

public class demoProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Double, List<String>> productsByPrice = new HashMap<>();

        String line = scan.nextLine();

        while (!line.equals("buy")){
            String[] productPrice = line.split(" ");
            String product = productPrice[0];
            Double price = Double.parseDouble(productPrice[1]);
            if (!productsByPrice.containsKey(price)){
                productsByPrice.put(price, new ArrayList<>());
            }
            productsByPrice.get(price).add(product);

            line = scan.nextLine();

        }
        for (Map.Entry<Double ,List<String>> productPair : productsByPrice.entrySet()){
            System.out.print(productPair.getKey() + " :");
            for (String product : productPair.getValue()){
                System.out.println(product + ", ");
            }
            System.out.println();
        }
    }
}
