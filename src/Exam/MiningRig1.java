package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiningRig1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double priceVideoCard = Double.parseDouble(reader.readLine());
        double prehodnik = Double.parseDouble(reader.readLine());
        double electric = Double.parseDouble(reader.readLine());
        double profit = Double.parseDouble(reader.readLine());
        double totalPrice = priceVideoCard * 13 + prehodnik * 13 + 1000;
        double totalProfit = (profit - electric) * 13 ;
        double daysTotal = Math.ceil(totalPrice / totalProfit);
        System.out.printf("%.0f%n", totalPrice);
        System.out.printf("%.0f" , daysTotal);
    }
}
