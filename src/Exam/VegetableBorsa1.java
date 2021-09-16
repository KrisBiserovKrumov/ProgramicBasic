package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VegetableBorsa1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double priceV = Double.parseDouble(reader.readLine());
        double priceP = Double.parseDouble(reader.readLine());
        double kilosV = Double.parseDouble(reader.readLine());
        double kilosP = Double.parseDouble(reader.readLine());

        double totalPriceV = priceV * kilosV;
        double totalPriceP = priceP * kilosP;

        double euro = (totalPriceP + totalPriceV) / 1.94;
        System.out.printf("%.2f", euro);


    }
}
