package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TravelingToSea1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double priceLunch = Double.parseDouble(reader.readLine());
        double pricesivenir = Double.parseDouble(reader.readLine());
        double pricehotel = Double.parseDouble(reader.readLine());

        double litersBenzin = 420  * 7  ;
        double priceBenzin = litersBenzin *  1.85 / 100 ;
        double price = 3 * priceLunch + 3 * pricesivenir;
        double pricehotel1 = pricehotel * 0.9;
        double pricehotel2 = pricehotel * 0.85;
        double pricehotel3 = pricehotel * 0.8;
        double moneyTotal = priceBenzin + price + pricehotel1 + pricehotel2 + pricehotel3;

        System.out.printf("Money needed: %.2f", moneyTotal);



    }
}
