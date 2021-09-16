package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class book {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double pricePage = Double.parseDouble(reader.readLine()) * 899;
        double pricePage2 = Double.parseDouble(reader.readLine()) * 2;
        double porcentDiscount = Double.parseDouble(reader.readLine()) / 100;
        double priceDizainer = Double.parseDouble(reader.readLine());
        double porcentOfEquip = Double.parseDouble(reader.readLine()) / 100;
        double priceTotal =  pricePage + pricePage2;

        double priceWithoutDiscount = priceTotal * ( 1 - porcentDiscount);
        double total2 = priceWithoutDiscount + priceDizainer;
        double total = total2 * (1 - porcentOfEquip );

        System.out.printf("Avtonom should pay %.2f BGN.", total);


    }
}
