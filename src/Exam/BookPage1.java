package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookPage1 {
    public static void main(String[] args) throws IOException {

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                double pricePage = Double.parseDouble(reader.readLine());
                double pricePage2 = Double.parseDouble(reader.readLine());
                double discount = Double.parseDouble(reader.readLine()) / 100;
                double priceDizaner = Double.parseDouble(reader.readLine());
                double priceOfEquip = Double.parseDouble(reader.readLine()) / 100;

                double priceBook = pricePage * 899 + pricePage2 * 2 ;
                double priceBookDiscount = priceBook * (1 - discount);
                double dizaner = priceBookDiscount + priceDizaner;
                double totalPrice = dizaner * (1 - priceOfEquip) ;

                System.out.printf("Avtonom should pay %.2f BGN.", totalPrice);


            }
        }

