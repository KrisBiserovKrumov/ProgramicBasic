package ExamPreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercais1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double priceProcesor = Double.parseDouble(reader.readLine())* 1.57;
        double priceVideoCard = Double.parseDouble(reader.readLine())* 1.57;
        double priceRAM = Double.parseDouble(reader.readLine())* 1.57;
        double cuantityRam = Double.parseDouble(reader.readLine());
        double discount = Double.parseDouble(reader.readLine());

        double totaPriceRam = priceRAM * cuantityRam;
        double totalPriceProcesor = priceProcesor - (priceProcesor * discount);
        double totalPriceVideoCard = priceVideoCard - (priceVideoCard * discount);
        double total = totalPriceProcesor + totalPriceVideoCard + totaPriceRam;

        System.out.printf("Money needed - %.2f leva.",total );


    }
}
