package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UpgradedMatcher {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] product = reader.readLine().split(" ");
        int[] quantity = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        double[] price =Arrays.stream(reader.readLine().split(" ")).mapToDouble(e -> Double.parseDouble(e)).toArray();
        String line = reader.readLine();

        while (!line.equals("done")){
            String[] comand =line.split(" ");
            for (int i = 0; i < product.length; i++) {
                if (comand[0].length()==(product[i].length())){
                    System.out.println(comand[i] + " x " + quantity[i] + " cost ");

                }else {
                    System.out.println("We do not have enough " + comand[i]);
                }

            }
        }
    }
}
